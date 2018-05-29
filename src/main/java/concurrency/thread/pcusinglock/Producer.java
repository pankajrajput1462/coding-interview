package concurrency.thread.pcusinglock;

public class Producer implements Runnable {

	private ProducerConsumerImpl consumerImpl;

	public Producer(ProducerConsumerImpl sharedObject) {
		consumerImpl = sharedObject;
	}

	@Override
	public void run() {
		try {
			consumerImpl.put();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}

}
