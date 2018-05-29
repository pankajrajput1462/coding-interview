package concurrency.waitandnotify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Worker implements Runnable {

    BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>();
    Worker next;

    @Override
    public void run() {
        while (true) {
            try {
                Integer take = blockingQueue.take();
                System.out.println(Thread.currentThread() + " > " + take);
                //Thread.sleep(1000);

                if (next != null) {
                    next.accept(take + 1); // Pass the Number to next Thread
                }

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


    public void setNext(Worker next) {
        this.next = next;
    }

    public void accept(int e) {
        blockingQueue.offer(e);
    }
}

public class SequencePrinting {

    public static void main(String[] args) {
        // Create the workers
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();

        // chain them in a round robin fashion
        w1.setNext(w2);
        w2.setNext(w3);
        w3.setNext(w1);

        // Create named threads for the workers
        Thread t1 = new Thread(w1, "Thread-1 - ");
        Thread t2 = new Thread(w2, "Thread-2 - ");
        Thread t3 = new Thread(w3, "Thread-3 - ");

        // start the threads
        t1.start();
        t2.start();
        t3.start();

        // Seed the first worker
        w1.accept(1);

    }
}
