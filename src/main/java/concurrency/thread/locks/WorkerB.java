package concurrency.thread.locks;

public class WorkerB implements Runnable {

	Job job;
	
	public WorkerB(Job job) {
		this.job = job;
	}

	@Override
	public void run() {
		System.out.println(" WorkerB "+Thread.currentThread().getName());
		job.B("WorkerB", 200);

	}

}
