package concurrency.waitandnotify.six;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreeThreadCommunicationMain {

    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(1);
        int[] array1 = new int[]{1, 4, 7};
        int[] array2 = new int[]{2, 5, 8};
        int[] array3 = new int[]{3, 6, 9};

        Worker worker = new Worker(array1, counter);
        Worker workerTwo = new Worker(array2, counter);
        Worker workerThree = new Worker(array3, counter);

        Thread t1 = new Thread(worker, "1");
        Thread t2 = new Thread(workerTwo, "2");
        Thread t3 = new Thread(workerThree, "3");

        t1.start();
        t2.start();
        t3.start();
    }

}