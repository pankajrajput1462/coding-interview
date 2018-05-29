package filereading.apachepoi;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by psi143 on 2/16/2017.
 */
public class FileReadingUsingNIO {

    public static void main(String... args) {
        //directoryTraversal();
       // directoryTraversalJava7();
        directoryTraversaljava8();
    }

    private static void directoryTraversaljava8() {
        try (Stream<Path> paths = Files.walk(Paths.get("C:\\"))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void directoryTraversalJava7() {
        Path path = Paths.get("C:\\Users");

        FileVisitor <Path> visitor = new SimpleFileVisitor<Path>(){
            public FileVisitResult visitFile(Path path1, BasicFileAttributes attributes) throws IOException {
                System.out.println(path1);
                return FileVisitResult.CONTINUE;
            }
        };

        try {
            Files.walkFileTree(path,visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void directoryTraversal() {
        File[] files = new File("C:\\").listFiles();
        showFiles(files);
    }

    public static void showFiles(File[] files) {
        if (files!=null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    showFiles(file.listFiles()); // Calls same method again.
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }

}
