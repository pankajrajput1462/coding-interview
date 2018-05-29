package concurrency.locks;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by psi143 on 11/8/2016.
 */
public class PrinterQueue {

	private final Lock lock = new ReentrantLock(true);

	public void printJob(Object document) {
		lock.lock();
		try {

			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName()
					+ ": PrintQueue: Printing a Job during "
					+ (duration / 1000) + " seconds :: Time - " + new Date());
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {

			System.out.printf("%s: The document has been printed\n", Thread
					.currentThread().getName());
			lock.unlock();
		}

	}

}
