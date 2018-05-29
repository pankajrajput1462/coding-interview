package thread.pc;

public class Producer implements Runnable {


    private int MAX;
    int[] queue;

    public Producer(int[] queue, int max) {
        this.queue = queue;
        this.MAX = max;
    }

    public void run() {
        if (!isFull()) {
            synchronized (queue) {
                for (int i = 0; i < MAX; i++) {
                    queue[i] = i;
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    };
                    System.out.println("PUT: " + i + " " + Thread.currentThread().getName());
                }
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    public boolean isFull() {
        return queue.length > MAX;

    }

}
