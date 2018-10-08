package practice;


import sun.security.krb5.internal.TGSRep;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

class  Producer implements  Runnable{
    private final ArrayBlockingQueue<Integer> queue;

    Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Adding value in Array Blocking Queue");
            int e = new Random().nextInt();
            queue.offer(e);
            System.out.println("Adding "+ e+" in Array Blocking Queue - Completed");
        }
    }
}

class  Consumer implements  Runnable{
    private ArrayBlockingQueue<Integer> queue;

    Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("queue.take() = " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PracticeMain {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();


    }
}
