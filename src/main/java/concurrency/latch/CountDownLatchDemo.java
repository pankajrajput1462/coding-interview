package concurrency.latch;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Started");
        CountDownLatch countDownLatch = new CountDownLatch(2);
        BlockingQueue<String> filePathList = new ArrayBlockingQueue<>(2);
        filePathList.add("src/main/resources/data1.csv");
        filePathList.add("src/main/resources/data2.csv");
        List<FileReadTask> fileReadTasks = new ArrayList<>();
        fileReadTasks.add(new FileReadTask(filePathList, countDownLatch));
        fileReadTasks.add(new FileReadTask(filePathList, countDownLatch));
        System.out.println("All Thread are running");
        fileReadTasks.forEach(fileReadTask -> new Thread(fileReadTask).start());
        System.out.println("Waiting for thread to complete");
        countDownLatch.await();
        System.out.println("Done = " + countDownLatch.getCount());
    }
}
