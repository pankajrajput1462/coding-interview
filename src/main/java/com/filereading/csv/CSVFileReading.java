package com.filereading.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVFileReading {
    public static void main(String[] args) throws IOException, URISyntaxException {


        String path="/home/pankaj/gitHub/usecase/src/main/java/com/filereading/csv/student.csv";
        final BufferedReader reader = Files.newBufferedReader(Paths.get(path));
       // CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("name","id"));
        final List<CSVRecord> records = csvParser.getRecords();
        for (int i = 0; i < records.size(); i++) {
            final CSVRecord record = records.get(i);
            //System.out.println("record = " + record);
           // System.out.println("record = " + record.get("id"));
            final String name = record.get(0);
            final String id = record.get(1);
            System.out.println("Name : id " + name+" , "+id);
        }

    }
}
