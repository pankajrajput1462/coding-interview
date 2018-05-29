package concurrency.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Hello world!
 *
 */
public class MultipleProducerConsumer {
	public static void main(String args[]) {

		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();

		Thread prodThread1 = new Thread(new Producer(sharedQueue, 1));
		Thread prodThread2 = new Thread(new Producer(sharedQueue, 2));
		Thread consThread1 = new Thread(new Consumer(sharedQueue, 1));
		Thread consThread2 = new Thread(new Consumer(sharedQueue, 2));

		prodThread1.start();
		prodThread2.start();
		consThread1.start();
		consThread2.start();
	}

}
