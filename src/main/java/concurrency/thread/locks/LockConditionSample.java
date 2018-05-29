package concurrency.thread.locks;

public class LockConditionSample {

	public static void main(String[] args) throws InterruptedException {

		Runner runner = new Runner();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		
		thread1.start();
		thread2.start();


		thread1.join();
		thread2.join();


		runner.finished();

	}

}
