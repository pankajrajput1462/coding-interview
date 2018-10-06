package practice;

import java.io.*;

public class CustomBlockingQueue<R> {

    public static void main(String[] args) throws FileNotFoundException {
        String pathname = "";
        File file = new File(pathname); // java.io.File
        Reader in = new FileReader(file); // java.io.Reader
        BufferedReader reader= new BufferedReader(in);
        try {
            String line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
