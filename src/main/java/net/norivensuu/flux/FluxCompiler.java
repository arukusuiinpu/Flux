package net.norivensuu.flux;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// TODO Write a custom error handler for Flux code specifically (still expose the Java one)
public class FluxCompiler {

    private static final Path OUTPUT_ROOT_DIR = Paths.get("src/generated");
    private static final Path OUTPUT_SOURCE_ROOT = OUTPUT_ROOT_DIR.resolve("java");
    private static final Path OUTPUT_ROOT = OUTPUT_SOURCE_ROOT;

    private static final Path PROJECT_ROOT = Paths.get("net/norivensuu/testflux");

    static void main(String[] args) throws IOException {
        System.out.println("Starting compilation of project: src/main/flux/" + PROJECT_ROOT);

//        generateMavenPomFile();

        try (Stream<Path> paths = Files.walk(Paths.get("src/main/flux/", PROJECT_ROOT.toString()))) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".flux"))
                    .forEach(FluxCompiler::compileFile);
        }
    }

    private static void runMavenCommand(String... commands) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();

        String[] mvnCommand = new String[commands.length + 1];
        mvnCommand[0] = "mvn";
        System.arraycopy(commands, 0, mvnCommand, 1, commands.length);

        processBuilder.command(mvnCommand);
        processBuilder.directory(OUTPUT_ROOT_DIR.toFile());
        processBuilder.inheritIO();

        Process process = processBuilder.start();
        int exitCode = process.waitFor();

        if (exitCode != 0) {
            throw new RuntimeException("Maven command failed with exit code: " + exitCode);
        }
    }

    private static void compileFile(Path filePath) {
        System.out.println("\n--- Compiling: " + filePath.getFileName() + " ---");
        try {
            InputStream input = new FileInputStream(filePath.toFile());
            CharStream cs = CharStreams.fromStream(input);
            FluxLexer lexer = new FluxLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FluxParser parser = new FluxParser(tokens);

            ParseTree tree = parser.program();

            System.out.println("Successfully parsed " + filePath.getFileName());

            JavaCodeGeneratorVisitor generator = new JavaCodeGeneratorVisitor();
            String generatedJavaCode = generator.visit(tree);

            writeGeneratedJavaFile(filePath, generatedJavaCode);

        } catch (IOException e) {
            System.err.println("Error processing file: " + filePath);
            e.printStackTrace();
        }
    }

    private static void writeGeneratedJavaFile(Path originalFluxPath, String javaSourceCode) {
        try {
            Path relativePath = PROJECT_ROOT;
            Path outputDirectory = OUTPUT_ROOT.resolve(relativePath);

            Files.createDirectories(outputDirectory);

            String fileName = originalFluxPath.getFileName().toString().replace(".flux", ".java");
            Path outputPath = outputDirectory.resolve(fileName);

            try (FileWriter writer = new FileWriter(outputPath.toFile())) {
                writer.write(javaSourceCode);
            }
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