package concurrency.thread.reentrant;

class Worker {

	synchronized public void firtsMonitorLock() {

		System.out.println("First Lock");
		System.out.println("-> Locking Again :" + takingMonitorAgain());
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(5000055);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	synchronized public boolean takingMonitorAgain() {
		System.out.println("Locked again");
		System.out.println(Thread.currentThread());
		return true;

	}

}

public class ReeEntrantExample {

	public static void main(String[] args) {
		final Worker worker = new Worker();
		Runnable thread = new Runnable() {
			public void run() {

				worker.firtsMonitorLock();
			}

		};

		Thread thread2 = new Thread(thread, "One");
		thread2.start();
	}
}
