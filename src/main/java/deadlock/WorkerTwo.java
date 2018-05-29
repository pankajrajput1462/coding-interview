package deadlock;

class WorkerTwo implements Runnable {
	public void run() {
		synchronized (DeadLockExample.lockObject2) {
			System.out.println(Thread.currentThread().getName() + ": Got lockObject2. Trying forlockObject1");
			try {
			//	Thread.sleep(500);
				 DeadLockExample.lockObject2.wait(500);
				//DeadLockExample.lockObject2.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (DeadLockExample.lockObject1) {
				System.out.println(Thread.currentThread().getName() + ": Got lockObject1.");
			}
		}
	}
}