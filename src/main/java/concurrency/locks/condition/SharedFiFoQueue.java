package concurrency.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedFiFoQueue {
    private Object[] elems = null;
    private int current = 0;
    private int placeIndex = 0;
    private int removeIndex = 0;

    private final Lock lock = new ReentrantLock();
    private final Condition isEmpty = lock.newCondition();
    private final Condition isFull = lock.newCondition();

    public SharedFiFoQueue(int capacity) {
        this.elems = new Object[capacity];
    }

    public void add(Object elem) throws InterruptedException {
        lock.lock();
        try {
            while (current >= elems.length) {
                isFull.await();
            }
            elems[placeIndex] = elem;
            //We need the modulo, in oder to avoid going out of bound
            placeIndex = (placeIndex + 1) % elems.length;
            current++;
            //Notify the consumer that data is available
            isEmpty.signal();
        } finally {
            lock.unlock();

        }

    }


    public String remove() {
        Object elem = null;
        lock.lock();
        try {
            while (current <= 0) {
                try {
                    isEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            elem = elems[removeIndex];
            removeIndex = (removeIndex + 1) % elems.length;
            --current;
            //Notify the producer, space is available
            isFull.signal();
        } finally {
            lock.unlock();
        }
        return String.valueOf(elem);
    }
}
