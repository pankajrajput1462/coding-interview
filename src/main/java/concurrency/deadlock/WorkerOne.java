package concurrency.deadlock;

class WorkerOne implements Runnable {
	public void run() {
		synchronized (DeadLockExample.lockObject1) {
			System.out.println(Thread.currentThread().getName() + ": Got lockObject1. Trying forlockObject2");
			try {
				//Thread.sleep(500);
				 DeadLockExample.lockObject1.wait(500);
				// DeadLockExample.lockObject1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (DeadLockExample.lockObject2) {
				System.out.println(Thread.currentThread().getName() + ": Got lockObject2.");
			}
		}
	}
}
