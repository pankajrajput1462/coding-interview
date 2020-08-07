package concurrency.exception;

import java.util.concurrent.BlockingQueue;

public class Job implements Runnable {
    private final BlockingQueue<String> taskList;

    public Job(BlockingQueue<String> taskList) {

        this.taskList = taskList;
    }

    @Override
    public void run() {
        while (true) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " = " + taskList.poll());
            if (threadName.contains("thread-1"))
                try {
                    getError();
                } catch (Exception e) {
                    System.out.println(threadName + " e = " + e.getMessage());
                }
            if (taskList.isEmpty()) {
                System.out.println("Exiting...............");
                break;
            }
        }
    }

    private void getError() {
        throw new AirthmaticException("Manual Exception");
    }
}
