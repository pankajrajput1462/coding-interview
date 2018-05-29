package locks.condition;

public class ConditionExample {
    public static void main(String[] args) throws InterruptedException {
        SharedFiFoQueue sharedFiFoQueue = new SharedFiFoQueue(10);
        Thread producer = new Thread(new Producer(sharedFiFoQueue));
        Thread consumer = new Thread(new Consumer(sharedFiFoQueue));
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
