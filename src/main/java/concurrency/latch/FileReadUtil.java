package concurrency.latch;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadUtil {
    @SneakyThrows
    public static List<String> readCSVFile(String filePath) {
        System.out.println("Reading file started");
        Path path = Paths.get(filePath);
        BufferedReader lines = Files.newBufferedReader(path, Charset.defaultCharset());
        System.out.println("Data Returned");
        return lines.lines().skip(1).collect(Collectors.toList());
    }
}
