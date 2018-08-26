package concurrency.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class RunnableThread implements Runnable {
    private Lock lock;
    private Condition condition1;
    private Condition condition2;
    private Condition condition3;
    private boolean isOnePrint = false;
    private boolean isTwoPrint = false;

    public RunnableThread(Lock lock, Condition condition1, Condition condition2, Condition condition3) {
        this.lock = lock;
        this.condition1 = condition1;
        this.condition2 = condition2;
        this.condition3 = condition3;
    }

    @Override
    public void run() {
        if ("Thread-1".equals(Thread.currentThread().getName())) {
            methodForT1();
        } else if ("Thread-2".equals(Thread.currentThread().getName())) {
            methodForT2();
        } else {
            methodForT3();
        }
    }

    private void methodForT1() {
        lock.lock();
        try {
            for (int i = 1; i <= 15; i += 3) {
                if (!isOnePrint) {
                    condition2.signalAll();
                    System.out.println(Thread.currentThread().getName() + " Print = " + i);
                    Thread.sleep(1000);
                    isOnePrint = true;
                } else {
                    i = i - 3;
                    condition1.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private void methodForT2() {
        lock.lock();
        try {
            for (int i = 2; i <= 15; i += 3) {
                if (isOnePrint) {
                    condition3.signalAll();
                    System.out.println(Thread.currentThread().getName() + " Print = " + i);
                    Thread.sleep(1000);
                    isOnePrint = false;
                    isTwoPrint = true;
                } else {
                    i = i - 3;
                    condition2.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private void methodForT3() {
        lock.lock();
        try {
            for (int i = 3; i <= 15; i += 3) {
                if (isTwoPrint) {
                    condition1.signalAll();
                    System.out.println(Thread.currentThread().getName() + " Print = " + i);
                    Thread.sleep(1000);
                    isOnePrint = false;
                    isTwoPrint = false;
                } else {
                    i = i - 3;
                    condition3.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


public class LockConditionTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();
        RunnableThread runnableObj = new RunnableThread(lock, condition1, condition2, condition3);
        Thread t1 = new Thread(runnableObj, "Thread-1");
        Thread t2 = new Thread(runnableObj, "Thread-2");
        Thread t3 = new Thread(runnableObj, "Thread-3");
        t2.start();
        t1.start();
        t3.start();
    }
}
