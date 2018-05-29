package locks;

/**
 * Created by psi143 on 11/8/2016.
 */
public class LockMain {

	public static void main(String[] args) {
		PrinterQueue printerQueue = new PrinterQueue();

		Thread[] thread = new Thread[10];

		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(new PrintingJob(printerQueue), "Printer: "+ i);
		}

		
		for (int i = 0; i < thread.length; i++) {
			thread[i].start();
		}
		
	}

}
