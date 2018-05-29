package concurrency.deadlock;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDeadLock {

	public static void main(String[] args) {

		Object object1 = new Object();
		Object object2 = new Object();
		System.out.println("CountDown Created");
		CountDownLatch latch = new CountDownLatch(2);
		new Thread(new Locker(object1,object2,latch), "One").start();;
		new Thread(new Locker(object2,object1,latch), "two").start();;
		
		
	}

}
