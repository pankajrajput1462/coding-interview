package practice.sync;

import java.util.concurrent.locks.ReadWriteLock;

public class Prod implements Runnable {

    private final int MAX_SIZE = 10;

    private int[] list;


    public Prod(int[] list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("list = " + list);
        }

    }
}
