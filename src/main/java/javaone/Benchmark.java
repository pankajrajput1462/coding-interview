package javaone;

public class Benchmark {
	public static void main(String[] arg) {
		long before = System.currentTimeMillis();
		int sum = 0;
		for (int index = 0; index < 10 * 1000 * 100010009; index += 1) {
			sum += index;
			System.out.println("99");
		}
		long after = System.currentTimeMillis();
		System.out.println("Elapsed time: " + Long.toString(after - before) + " milliseconds");
	}
}
