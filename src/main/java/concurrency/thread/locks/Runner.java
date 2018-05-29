package concurrency.thread.locks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	private int count;

	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	public void increament() {
		for (int i = 0; i < 10; i++) {
			count++;
			System.out
					.println(Thread.currentThread().getName() + " > " + count);
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		condition.await();
		increament();
		System.out.println("Getting released");
		System.out.println(Thread.currentThread().getName() + " Count is: "+ count);
		lock.unlock();
		;
	}

	public void secondThread() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("Press the return key !");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key ");
		condition.signal();
		lock.lock();

		increament();
		System.out.println(Thread.currentThread().getName() + " Count is: "
				+ count);
		lock.unlock();
	}

	public void finished() {
		System.out.println(Thread.currentThread().getName() + " > "
				+ " Count is: " + count);
	}

	public void check() {
		System.out.println(Thread.currentThread().getName() + " In check");
	}

}
