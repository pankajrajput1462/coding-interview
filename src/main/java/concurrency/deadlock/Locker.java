package concurrency.deadlock;

import java.util.concurrent.CountDownLatch;

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

	public Object getObject1() {
		return object1;
	}

	public void setObject1(Object object1) {
		this.object1 = object1;
	}

	public Object getObject2() {
		return object2;
	}

	public void setObject2(Object object2) {
		this.object2 = object2;
	}

	public CountDownLatch getLatch() {
		return latch;
	}

	public void setLatch(CountDownLatch latch) {
		this.latch = latch;
	}

}
