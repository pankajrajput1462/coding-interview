package concurrency.thread;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> sharedqueue;
	int threadNo;

	public Producer(BlockingQueue<Integer> queue, int threadNo) {
		this.sharedqueue = queue;
		this.threadNo = threadNo;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int number = i + (10 * threadNo);
			try {
				System.out.println("Produced:" + number + ":by thread:" + threadNo);
				sharedqueue.put(number);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
