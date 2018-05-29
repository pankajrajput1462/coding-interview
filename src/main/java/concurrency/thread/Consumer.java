package concurrency.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	private int threadNo;

	public Consumer(BlockingQueue<Integer> sharedQueue, int threadNo) {
		this.sharedQueue = sharedQueue;
		this.threadNo = threadNo;
	}

	public void run() {
		while (true) {
			try {
				int num = sharedQueue.take();
				System.out.println("Consumed: " + num + ":by thread:" + threadNo);
			} catch (Exception err) {
				err.printStackTrace();
			}
		}
	}

}
