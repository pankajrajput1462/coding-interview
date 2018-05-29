package thread.executerpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new WorkerThread(" " + i);
			executorService.execute(runnable);
			while (!executorService.isTerminated()) {
				
			}
		}
		System.out.println("Finished All Thread");
	}

}
