package concurrency.thread.pcusinglock;

public class ProducerConsumerSolutionUsingLock {

	public static void main(String[] args) {

		// Object on which pc will operate
		ProducerConsumerImpl sharedObject = new ProducerConsumerImpl();

		Producer producer = new Producer(sharedObject);
		Consumer consumer = new Consumer(sharedObject);

		Thread prod = new Thread(producer, "producer");
		Thread cons = new Thread(consumer, "consumer");

		prod.start();
		cons.start();
	}
}
