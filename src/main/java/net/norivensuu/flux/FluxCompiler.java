package net.norivensuu.flux;

import net.norivensuu.flux.structure.FluxNode;
import net.norivensuu.flux.structure.program.ProgramNode;
import org.antlr.v4.runtime.*;
import org.objectweb.asm.ClassWriter;

import java.io.FileInputStream;
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
    private static Map<FluxParser.ProgramContext, Program> programRegistry = new HashMap<>();

    public static Map<FluxParser.ProgramContext, Program> getProgramRegistry() {
        return programRegistry;
    }

    public static class Program {
        public Set<String> imports = new HashSet<>();
        public FluxParser.ProgramContext ctx;

        public Program(FluxParser.ProgramContext ctx) {
            this.ctx = ctx;
        }

//        public FluxParser.DeclarationContext addImport(String importPath) {
//            return FluxCompiler.addImport(importPath, ctx);
//        }
    }

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
                        }
                    });
        }
    }

    private static void compileFile(Path filePath) {
        long startTime = System.nanoTime();
        System.out.println("\n--- Compiling: " + filePath.getFileName() + " ---");
        try {
            FluxMetadata metadata = buildClosestMetadata(filePath.getParent());

            InputStream input = new FileInputStream(filePath.toFile());
            CharStream cs = CharStreams.fromStream(input);
            ProgramNode node = getProgramContext(cs, metadata);

            System.out.println("Successfully parsed and enriched " + filePath.getFileName());

            Path relativeToRoot = PROJECT_ROOT.relativize(filePath);

            String internalClassName = PROJECT_STRUCTURE_ROOT.resolve(relativeToRoot)
                    .toString()
                    .replace(".flux", "")
                    .replace("\\", "/");

            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

            FluxNode.visit(node);

            byte[] bytecode = cw.toByteArray();

            writeGeneratedClassFile(filePath, bytecode, startTime);

        } catch (IOException e) {
            System.err.println("Error processing file: " + filePath);
            e.printStackTrace();
        }
    }

    private static ProgramNode getProgramContext(CharStream cs, FluxMetadata metadata) {
        FluxLexer lexer = new FluxLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FluxParser parser = new FluxParser(tokens);

        FluxParser.ProgramContext tree = parser.program();
        ProgramNode node = new ProgramNode(tree);

        var program = new Program(tree);
        programRegistry.put(tree, program);

        if (metadata != null && metadata.imports != null) {
//            if (tree.children != null) {
//                for (ParseTree child : tree.children) {
//                    if (child instanceof FluxParser.DeclarationContext decl) {
//                        if (decl.importDecl() != null && decl.importDecl().qualifiedId() != null) {
//                            program.imports.add(decl.importDecl().qualifiedId().getText() + (decl.importDecl().wildcard != null ? decl.importDecl().wildcard.getText() : ".*"));
//                        }
//                    }
//                }
//            }

            for (String importPath : metadata.imports) {
                if (program.imports.contains(importPath)) {
                    continue;
                }

//                addImport(importPath, tree);
            }
        }

        return node;
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

    private static void loadAndExecute(byte[] bytecode, String className) {
        class FluxClassLoader extends ClassLoader {
            public Class<?> define(String name, byte[] b) {
                return defineClass(name, b, 0, b.length);
            }
        }

        try {
            FluxClassLoader loader = new FluxClassLoader();
            Class<?> clazz = loader.define(className, bytecode);
            clazz.getMethod("main", String[].class).invoke(null, (Object) new String[]{});
        } catch (Exception e) {
            System.err.println("Runtime execution failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void writeGeneratedClassFile(Path originalFluxPath, byte[] bytecode, long startTime) {
        try {
            Path relativePath = FLUX_SOURCE_ROOT.relativize(originalFluxPath);
            Path relativeParent = relativePath.getParent();

            Path outputDirectory = (relativeParent != null)
                    ? OUTPUT_ROOT.resolve(relativeParent)
                    : OUTPUT_ROOT;

            Files.createDirectories(outputDirectory);

            String fileName = originalFluxPath.getFileName().toString().replace(".flux", ".class");
            Path outputPath = outputDirectory.resolve(fileName);

            Files.write(outputPath, bytecode);

            long endTime = System.nanoTime();
            long durationNanos = endTime - startTime;
            double durationMillis = durationNanos / 1_000_000.0;

            System.out.printf("Generated Class file: %s in %.2f ms%n", outputPath, durationMillis);
        } catch (IOException e) {
            System.err.println("Error writing generated Class file: " + e.getMessage());
        }
    }
}