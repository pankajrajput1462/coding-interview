package deadlock;

public class DeadLockExample {
	final static Object lockObject1 = new Object();
	final static Object lockObject2 = new Object();
	final static Object lockObject3 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new WorkerOne(), "one");

		t1.start();
		Thread t2 = new Thread(new WorkerTwo(), "two");

		t2.start();
	}
}