package concurrency.latch;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class FileReadTask implements Runnable {

    private final BlockingQueue<String> blockingQueue;
    private final CountDownLatch countDownLatch;

    public FileReadTask(BlockingQueue<String> blockingQueue, CountDownLatch countDownLatch) {
        this.blockingQueue = blockingQueue;
        this.countDownLatch = countDownLatch;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        List<String> list = FileReadUtil.readCSVFile(blockingQueue.poll());
        System.out.println(Thread.currentThread().getName() + "> " + list);
        Thread.sleep(60000);
        countDownLatch.countDown();
        System.out.println("c = " + countDownLatch.getCount());
    }
}
