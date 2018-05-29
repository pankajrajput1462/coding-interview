package thread.pc;

public class Consumer implements Runnable {

    int[] queue;
    private int MAX;

    public Consumer(int[] queue, int max) {
        this.queue = queue;
        this.MAX = max;
    }

    public void run() {
        if (!isEmpty()) {
            synchronized (queue) {
                for (int i = 0; i < MAX; i++)
                    System.out.println("GET: " + i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.notifyAll();
        }
    }


    public boolean isEmpty() {
        return queue.length < 1;

    }

}
