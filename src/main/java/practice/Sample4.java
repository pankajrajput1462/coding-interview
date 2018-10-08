package practice;

import java.util.concurrent.CompletableFuture;

public class Sample4 {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> System.out.println("args = " + args));
    }
}
