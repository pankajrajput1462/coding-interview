package concurrency.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

@Slf4j
public class Producer implements Runnable {

    private final BlockingQueue<Integer> sharedqueue;
    private int threadNo;

    public Producer(BlockingQueue<Integer> queue, int threadNo) {
        this.sharedqueue = queue;
        this.threadNo = threadNo;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int number = i + (10 * threadNo);
            try {
                log.info("Produced:" + number + ":by thread:" + threadNo);
                sharedqueue.put(number);
            } catch (InterruptedException e) {
                log.error("{}", e.getMessage());
            }

        }

    }

}
