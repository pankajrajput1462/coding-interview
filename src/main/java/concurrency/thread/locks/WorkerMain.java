package concurrency.thread.locks;

public class WorkerMain {

	public static void main(String[] args) throws InterruptedException {
		
		 Job job = new Job();
		Thread thread1 = new Thread(new Worker(job), "ThreadOne");
		Thread thread2 = new Thread(new WorkerB(job), "Threadtwo");
		thread1.start();
		Thread.sleep(100);
		thread2.start();
	}

}
