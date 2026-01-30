package net.norivensuu.flux;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

// TODO Write a custom error handler for Flux code specifically (still expose the Java one)
public class FluxCompiler {

    private static final Path FLUX_SOURCE_ROOT = Paths.get("src/main/flux");
    private static final Path OUTPUT_ROOT_DIR = Paths.get("src/generated");
    private static final Path OUTPUT_SOURCE_ROOT = OUTPUT_ROOT_DIR.resolve("java");
    private static final Path OUTPUT_ROOT = OUTPUT_SOURCE_ROOT;

    private static final Path PROJECT_STRUCTURE_ROOT = Paths.get("net/norivensuu/testflux");
    private static final Path PROJECT_ROOT = FLUX_SOURCE_ROOT.resolve(PROJECT_STRUCTURE_ROOT);
    private static final Path PROJECT_METADATA = PROJECT_ROOT.resolve("inherited.flux");

    private static Map<Path, FluxMetadata> metadataRegistry = new HashMap<>();

    static void main(String[] args) throws IOException {
        System.out.println("Starting compilation of project: " + PROJECT_ROOT);

        if (Files.exists(PROJECT_METADATA))
            loadOrCreateMetadata(PROJECT_METADATA);
        else
            metadataRegistry.put(PROJECT_ROOT, new FluxMetadata().appendDefault());

        try (Stream<Path> paths = Files.walk(PROJECT_ROOT)) {
            paths.filter(Files::isRegularFile)
                    .forEach(p -> {
                        String fileName = p.toString();
                        if (fileName.endsWith(".flux")) {
                            compileFile(p);
                        } else if (fileName.endsWith(".flux.meta")) {
                            FluxMetadata defaultMeta = new FluxMetadata().appendDefault();
                            metadataRegistry.put(p, defaultMeta);
                        }
                    });
        }
    }

    private static void compileFile(Path filePath) {
        System.out.println("\n--- Compiling: " + filePath.getFileName() + " ---");
        try {
            FluxMetadata metadata = buildClosestMetadata(filePath.getParent());

            InputStream input = new FileInputStream(filePath.toFile());
            CharStream cs = CharStreams.fromStream(input);
            FluxParser.ProgramContext tree = getProgramContext(cs, metadata);

            System.out.println("Successfully parsed and enriched " + filePath.getFileName());

            JavaCodeGeneratorVisitor generator = new JavaCodeGeneratorVisitor();
            String generatedJavaCode = generator.visit(tree);

            writeGeneratedJavaFile(filePath, generatedJavaCode);

        } catch (IOException e) {
            System.err.println("Error processing file: " + filePath);
            e.printStackTrace();
        }
    }

    private static FluxParser.ProgramContext getProgramContext(CharStream cs, FluxMetadata metadata) {
        FluxLexer lexer = new FluxLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FluxParser parser = new FluxParser(tokens);

        FluxParser.ProgramContext tree = parser.program();

        if (metadata != null && metadata.imports != null) {
            Set<String> existingImports = new HashSet<>();
            if (tree.children != null) {
                for (ParseTree child : tree.children) {
                    if (child instanceof FluxParser.DeclarationContext decl) {
                        if (decl.importDecl() != null && decl.importDecl().qualifiedId() != null) {
                            existingImports.add(decl.importDecl().qualifiedId().getText() + (decl.importDecl().wildcard != null ? decl.importDecl().wildcard.getText() : ".*"));
                        }
                    }
                }
            }

            for (String importPath : metadata.imports) {
                if (existingImports.contains(importPath)) {
                    continue;
                }

                FluxParser.DeclarationContext declarationContext = new FluxParser.DeclarationContext(tree, -1);
                FluxParser.ImportDeclContext syntheticImport = new FluxParser.ImportDeclContext(declarationContext, -1);

                syntheticImport.addAnyChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__0, "import ")));

                FluxParser.QualifiedIdContext qualIdCtx = new FluxParser.QualifiedIdContext(syntheticImport, -1);
                qualIdCtx.addAnyChild(new TerminalNodeImpl(new CommonToken(FluxLexer.ID, importPath)));
                syntheticImport.addAnyChild(qualIdCtx);

                Token wildcardToken = new CommonToken(FluxLexer.WILDCARD, ".*");
                syntheticImport.addAnyChild(new TerminalNodeImpl(wildcardToken));

                FluxParser.TerminatorContext terminator = new FluxParser.TerminatorContext(declarationContext, -1);
                terminator.addAnyChild(new TerminalNodeImpl(new CommonToken(FluxLexer.TERMINATOR, ";")));

                declarationContext.addAnyChild(syntheticImport);
                declarationContext.addAnyChild(terminator);

                if (tree.children == null) {
                    tree.addAnyChild(declarationContext);
                } else {
                    tree.children.addFirst(declarationContext);
                }
                declarationContext.parent = tree;
            }
        }

        return tree;
    }

    private static FluxMetadata buildClosestMetadata(Path directory) {
        Path current = directory;
        FluxMetadata accumulatedMetadata = null;

        while (current != null && current.startsWith(FLUX_SOURCE_ROOT)) {
            FluxMetadata levelMetadata = metadataRegistry.get(current);

            if (levelMetadata == null) {
                levelMetadata = findMetadataInDirectory(current);
            }

            if (levelMetadata != null) {
                accumulatedMetadata = applyMetadata(accumulatedMetadata, directory, levelMetadata);

                if (levelMetadata.top) {
                    accumulatedMetadata.top = true;
                    break;
                }
            }

            if (current.equals(FLUX_SOURCE_ROOT)) {
                break;
            }

            current = current.getParent();
        }

        if (accumulatedMetadata == null) {
            accumulatedMetadata = new FluxMetadata().appendDefault();
        }

        metadataRegistry.put(directory, accumulatedMetadata);
        return accumulatedMetadata;
    }

    private static FluxMetadata findMetadataInDirectory(Path dir) {
        try (var stream = Files.list(dir)) {
            Optional<Path> metaFile = stream
                    .filter(p -> p.toString().endsWith(".flux.meta"))
                    .findFirst();


            if (metaFile.isEmpty()) return null;

            Path p = metaFile.get();
            try {
                return FluxMetadata.fromJson(Files.readString(p));
            } catch (Exception e) {
                System.err.println("Invalid metadata at " + p + ". Replacing with default.");
                FluxMetadata freshMeta = new FluxMetadata().appendDefault();
                Files.writeString(p, freshMeta.toJson());
                return freshMeta;
            }
        } catch (IOException e) {
            return null;
        }
    }

    private static FluxMetadata applyMetadata(FluxMetadata accumulator, Path originalDir, FluxMetadata found) {
        if (accumulator == null)
            accumulator = new FluxMetadata();
        accumulator.imports.addAll(found.imports);
        metadataRegistry.put(originalDir, accumulator);
        return accumulator;
    }

    private static FluxMetadata loadOrCreateMetadata(Path fluxPath) throws IOException {
        return loadOrCreateMetadata(fluxPath, false);
    }
    private static FluxMetadata loadOrCreateMetadata(Path targetPath, boolean top) throws IOException {
        String pathStr = targetPath.toString();
        Path metaPath = pathStr.endsWith(".flux")
                ? Paths.get(pathStr + ".meta")
                : targetPath.resolve(".flux.meta");

        FluxMetadata meta;
        try {
            if (Files.exists(metaPath)) {
                meta = FluxMetadata.fromJson(Files.readString(metaPath));
            } else {
                meta = new FluxMetadata(top).appendDefault();
            }
        } catch (Exception e) {
            meta = new FluxMetadata(top).appendDefault();
        }

        Files.writeString(metaPath, meta.toJson());
        return meta;
    }

    private static void writeGeneratedJavaFile(Path originalFluxPath, String javaSourceCode) {
        try {
            Path relativePath = FLUX_SOURCE_ROOT.relativize(originalFluxPath);

            Path relativeParent = relativePath.getParent();
            Path outputDirectory = (relativeParent != null)
                    ? OUTPUT_ROOT.resolve(relativeParent)
                    : OUTPUT_ROOT;

            Files.createDirectories(outputDirectory);

            String fileName = originalFluxPath.getFileName().toString().replace(".flux", ".java");
            Path outputPath = outputDirectory.resolve(fileName);

            Files.writeString(outputPath, javaSourceCode);

            System.out.println("Generated Java file: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error writing generated Java file: " + e.getMessage());
        }
    }

    private static void generateMavenPomFile() {
        // TODO Implement properly
        Path pomPath = OUTPUT_ROOT_DIR.resolve("pom.xml");
        try (FileWriter writer = new FileWriter(pomPath.toFile())) {
            System.out.println("\n--- Generating Maven POM file: " + pomPath + " ---");

            Files.createDirectories(OUTPUT_ROOT_DIR);

            String pomContent = String.format("""
            <project xmlns="http://maven.apache.org/POM/4.0.0"
                     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
                <modelVersion>4.0.0</modelVersion>

                <groupId>%s</groupId>
                <artifactId>%s</artifactId>
                <version>1.0.0-SNAPSHOT</version>

                <properties>
                    <maven.compiler.source>25</maven.compiler.source>
                    <maven.compiler.target>25</maven.compiler.target>
                    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
                </properties>
            </project>
            """, PROJECT_ROOT.toString().replace("\\", "."), PROJECT_ROOT.getFileName());

            writer.write(pomContent);
            System.out.println("Generated pom.xml successfully.");
        } catch (IOException e) {
            System.err.println("Error writing pom.xml: " + e.getMessage());
        }
    }

}