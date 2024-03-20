package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SequenceGenerator {
    public static void main(String[] args) {
        int count = 0;
        Object object = new Object();
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            service.submit(new Worker(count, object));
        }
    }
}
