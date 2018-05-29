package pan.baeldung.priorityjobsh;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityJobScheduler {
    private ExecutorService priorityJobPoolExecutor;
    private ExecutorService priorityJobScheduler
            = Executors.newSingleThreadExecutor();
    private PriorityBlockingQueue<Job> priorityQueue;


    public void scheduleJob(Job job) {
        priorityQueue.add(job);
    }
}
