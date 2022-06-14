package collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueMain {

    public static void main(String[] args) {

        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(8);

        arrayBlockingQueue.offer("hh");
        arrayBlockingQueue.forEach(System.out::println);
    }
}
