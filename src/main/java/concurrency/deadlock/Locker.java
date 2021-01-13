package concurrency.deadlock;

import lombok.Data;

import java.util.concurrent.CountDownLatch;

@Data
public class Locker implements Runnable {

    private Object object1;
    private Object object2;
    private CountDownLatch latch;

    public Locker(Object object1, Object object2, CountDownLatch latch) {

        this.setObject1(object1);
        this.setObject2(object2);
        this.setLatch(latch);
    }

    @Override
    public void run() {

        synchronized (object1) {
            latch.countDown();
            System.out.println(" Count Down by :"
                    + Thread.currentThread().getName());
            try {
                latch.await();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            synchronized (object2) {
                System.out.println("Object 2 having Lock");

            }
        }

    }

}
