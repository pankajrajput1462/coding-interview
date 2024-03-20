package concurrency.waitandnotify.two;

public class BigPrintNum {
    int turn = 0;

    public synchronized void print(int n, int i, int noThreads) {
        while (this.turn != i) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + i + "th seq = " + n);
        this.turn = (i + 1) % noThreads;
        notifyAll();
    }
}
