package concurrency.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecuterMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        BlockingQueue<String> taskList = new LinkedBlockingQueue<>();
        for (int i = 0; i < 1000; i++) {
            taskList.add("Pankaj: " + i);
        }
        executorService.execute(new Job(taskList));
        executorService.execute(new Job(taskList));
    }
}
