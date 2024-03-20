package concurrency.deadlock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class WorkerOne implements Runnable {
    public void run() {
        synchronized (DeadLockExample.lockObject1) {
            System.out.println(Thread.currentThread().getName() + ": Got lockObject1. Trying for lock Object2");
            try {
                //Thread.sleep(500);
                DeadLockExample.lockObject1.wait(500);
                // DeadLockExample.lockObject1.wait();
            } catch (InterruptedException e) {
                log.error("{}", e.getMessage());
            }
            synchronized (DeadLockExample.lockObject2) {
                log.info(Thread.currentThread().getName() + ": Got lock Object2.");
            }
        }
    }
}
