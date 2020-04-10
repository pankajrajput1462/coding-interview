package filereading.csv;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import util.DSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
public class CSVFileReading {
    public static void csvFileRead() throws IOException {
        final String path = DSUtil.getFilePathFromResource("student.csv");
        final BufferedReader reader = Files.newBufferedReader(Paths.get(path));
        final List<CSVRecord> records;
        try (CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("name", "id"))) {
            records = csvParser.getRecords();
        }
        for (final CSVRecord record : records) {
            final String name = record.get(0);
            final String id = record.get(1);
            log.info("{} {}", name, id);
        }
    }
}
