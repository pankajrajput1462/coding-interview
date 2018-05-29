package waitandnotify;

public class BigSequence {
	public static void main(String[] args) {
		BigPrintNum p = new BigPrintNum();
		int max = 20;
		int no_threads = 11;
		for (int i = 0; i < no_threads; i++) {
			boolean b[] = new boolean[no_threads];
			b[i] = true;
			Thread t = new Thread(new BigPrint(p, max, b, no_threads));
			t.start();
		}
	}
}

class BigPrint implements Runnable {

	int num = 0;
	BigPrintNum p;
	int max;
	int no_threads;
	boolean b[];

	public BigPrint(BigPrintNum p, int max, boolean b[], int no_threads) {
		this.p = p;
		this.max = max;
		this.b = b;
		this.no_threads = no_threads;
	}

	@Override
	public void run() {
		int n = 0;
		for (int i = 0; i < no_threads; i++) {
			if (b[i] == true) {
				n = i;
				num = i;
			}
		}
		while (num <= max) {
			p.print(num, n, no_threads);
			num += no_threads;
		}
	}
}

class BigPrintNum {
	int turn = 0;

	public synchronized void print(int n, int i, int no_threads) {
		while (this.turn != i) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+ i + "th seq = " + n);
		this.turn = (i + 1) % no_threads;
		notifyAll();
	}
}