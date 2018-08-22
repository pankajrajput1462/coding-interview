package concurrency.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

class ProducerConsumer<T> {

    private T data;
    Lock lock = new ReentrantLock();
    Condition dataCondition = this.lock.newCondition();
    Condition noDataCondition = this.lock.newCondition();

    public void put(T data) {
        if (data == null) {
            throw new IllegalArgumentException("data must not be null");
        }

        this.lock.lock();
        try {
            while (this.data != null) {
                try {
                    this.noDataCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.data = data;
            this.dataCondition.signal();
        } finally {
            this.lock.unlock();
        }
    }

    public T get() {

        this.lock.lock();
        try {
            while (this.data == null) {
                try {
                    this.dataCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            T returnValue = this.data;
            this.data = null;
            this.noDataCondition.signal();
            return returnValue;
        } finally {
            this.lock.unlock();
        }
    }

}

public class CompletableFutureMain {

    Lock lock = new ReentrantLock();
    Condition readNow = lock.newCondition();
    Condition writeNow = lock.newCondition();

    public void upDateDb() {
        lock.lock();
        try {
            writeNow.await(1000, TimeUnit.MILLISECONDS);
            System.out.println("lock = " + lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void futureDemo() {
        CompletableFuture.supplyAsync(this::sendMesg).thenApply(Integer::floatValue).thenAccept(this::brodcast);
    }

    private int sendMesg() {
        System.out.println("true = " + true);
        return 0;
    }

    private void brodcast(float l) {
        System.out.println("true = " + true);
    }

    public static void main(String[] args) {

        Function<Integer, Integer> times2 = e -> e * 2;

        Function<Integer, Integer> squared = e -> e * e;
        Integer apply = times2.compose(squared).apply(4);
        System.out.println("apply = " + apply);
        Integer apply1 = times2.andThen(squared).apply(4);
        System.out.println("apply1 = " + apply1);
    }
}
