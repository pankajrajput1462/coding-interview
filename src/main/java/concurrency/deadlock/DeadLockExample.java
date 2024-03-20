package concurrency.deadlock;

public class DeadLockExample {
    static final Object lockObject1 = new Object();
    static final Object lockObject2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new WorkerOne(), "one");
        t1.start();

        Thread t2 = new Thread(new WorkerTwo(), "two");
        t2.start();
    }
}