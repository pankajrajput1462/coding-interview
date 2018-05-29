package concurrency.thread.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Job {

	Lock lock = new ReentrantLock();

	public void A() {
		lock.lock();
		System.out.println("A started :" + Thread.currentThread());
				
		B("method A", 10000);
		C();
	}

	public void B(String str, long l) {
		System.out.println("B "+ Thread.currentThread());
		try {
			Thread.sleep(l);
			System.out.println("B slepibng "+ Thread.currentThread()+""+str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void C() {
		System.out.println("C "+ Thread.currentThread());
		lock.unlock();
	}

}
