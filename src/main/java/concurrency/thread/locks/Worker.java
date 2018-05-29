package concurrency.thread.locks;

public class Worker implements Runnable {

	Job job;
	
	public Worker(Job job) {
		this.job = job;
	}

	@Override
	public void run() {
		System.out.println(" "+Thread.currentThread().getName());
		job.A();

	}

}
