package concurrency.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadSample {
    public static void main(String[] args) {

        Runnable thread1=() -> {
            System.out.println(Thread.currentThread().getName());
        };

        Runnable thread2=() -> {
            System.out.println(Thread.currentThread().getName());
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(thread1);
        executorService.submit(thread2);

    }
}
