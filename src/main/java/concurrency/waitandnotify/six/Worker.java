package concurrency.waitandnotify.six;

import java.util.concurrent.atomic.AtomicInteger;

public class Worker implements Runnable {
	AtomicInteger counter;
	int[] array;
	static final Object mutex = new Object();

	public Worker(int[] array, AtomicInteger counter) {
		this.counter = counter;
		this.array = array;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < array.length) {
			synchronized (mutex) {
				if (Integer.parseInt(Thread.currentThread().getName()) == counter
						.get()) {
					System.out.println(Thread.currentThread().getName()+ " > "+array[i]);
					if (counter.get() == 3) {
						counter.getAndSet(1);
					} else {
						int c = counter.get();
						counter.getAndSet(++c);
					}
					i++;
				}

				mutex.notifyAll();
				try {
					mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
