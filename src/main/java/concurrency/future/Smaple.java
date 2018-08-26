package concurrency.future;

import org.springframework.util.Assert;

import java.util.concurrent.CompletableFuture;

import static org.springframework.util.Assert.isTrue;

public class Smaple {
    public static void main(String[] args) {
        runAsyncExample();
    }

    static void runAsyncExample() {

        CompletableFuture cf = CompletableFuture.runAsync(() -> {
            isTrue(Thread.currentThread().isDaemon());
            sleepEnough();

        });

        sleepEnough();
        isTrue(cf.isDone());

    }

    private static void sleepEnough() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Enough Sleeping");
        }
    }


}
