package practice.thread;

import java.util.concurrent.atomic.AtomicBoolean;

class Worker implements Runnable {

    Thread worker;
    AtomicBoolean running = new AtomicBoolean(true);


    @Override
    public void run() {
        while (running.get()) {
            System.out.println("worker = " + Thread.currentThread().getName());
        }
    }

    /**
     * For starting the thread
     */
    public void start() {
        worker = new Thread(this);
        worker.start();
    }

    /**
     * For Stop the thread
     */
    void stop() {
        running.set(false);
    }
}

public class SampleMain {
    public static void main(String[] args) {
        Worker worker= new Worker();
        worker.start();
        worker.stop();

    }
}
