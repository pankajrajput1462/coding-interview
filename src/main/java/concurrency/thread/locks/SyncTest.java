package concurrency.thread.locks;

class Work implements Runnable {
	int[] arr;

	@Override
	public void run() {
		System.out.println("Thread started");
		synchronized (arr) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread ended");
	}

	public Work(int[] arr) {
		super();
		this.arr = arr;
	}
}

public class SyncTest {

	public static void main(String[] args) throws InterruptedException {

		int[] a = { 1, 2, 3, 4, 5 };
		Thread t1 = new Thread(new Work(a));
		t1.start();
		Thread.sleep(100);
		//synchronized (a){
		a[4] =11;
		//}
		System.out.println("a :"+a[4]);
		//t1.join();
		System.out.println("main ended");
	}

}
