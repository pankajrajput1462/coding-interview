package concurrency.thread.pcusinglock;

public class Consumer implements Runnable {

	private ProducerConsumerImpl consumerImpl;

	public Consumer(ProducerConsumerImpl sharedObject) {
		consumerImpl = sharedObject;
	}

	@Override
	public void run() {
		try {
			consumerImpl.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
