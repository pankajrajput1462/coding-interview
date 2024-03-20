package filesio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReplaceData {
    void replace(String filePath, String targetPath, String target, String replace) {
        Path path = Path.of(filePath);
        try {
            String s = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            String s1 = s.replaceAll(target, replace);
            Files.write(Path.of(targetPath), s1.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void replaceByLine(String filePath, String targetPath, String target, String replace) {
        Path path = Path.of(filePath);
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//            String s1 = s.replaceAll(target, replace);
//            Files.write(Path.of(targetPath), s1.getBytes(StandardCharsets.UTF_8));
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
