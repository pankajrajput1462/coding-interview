package thread.pc;

public class PCTest {
	public static void main(String[] args) {
		int [] arr=new int[10];
		Producer producer = new Producer(arr,10);
		Consumer consumer = new Consumer(arr,10);
		Thread thread1 = new Thread(producer, "prod");
		Thread thread2 = new Thread(consumer, "cons");
		thread1.start();
		thread2.start();
		
		
		
		
		
	}

}
