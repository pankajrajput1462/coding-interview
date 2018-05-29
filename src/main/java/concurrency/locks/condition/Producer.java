package concurrency.locks.condition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Producer implements Runnable {

    public final String FILE_NAME = "/home/pankaj/gitHub/usecase/src/main/java/concurrency.locks/condition/input.txt";

    private SharedFiFoQueue sharedFiFoQueue;

    public Producer(SharedFiFoQueue sharedFiFoQueue) {
        this.sharedFiFoQueue = sharedFiFoQueue;
    }

    @Override
    public void run() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                final String[] split = line.split(" ");
                for (String s : split) {
                    sharedFiFoQueue.add(s);
                }
            }
            sharedFiFoQueue.add(null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(reader).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
