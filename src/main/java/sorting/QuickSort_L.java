package sorting;

public class QuickSort_L implements SortInterface {
	// helper method for QuickSort_L
	// Jon Bentley mentions he learned this method from
	// Nico Lomuto of Alsys Inc. ("Programming Pearls")
	private static int partition(SInteger[] A, int left, int right) {
		int i, p, middle;

		middle = (left + right) / 2;

		A[left].exchange(A[middle]);

		// Invariant: A[left+1:p] < A[left] and A[p+1:i-1] >= A[left]
		for (p = left, i = left + 1; i <= right; i++)
			if (A[i].compareTo(A[left]) < 0)
				A[++p].exchange(A[i]);

		A[left].exchange(A[p]);

		return p;
	}

	public void sort(SInteger[] A) {
		quickSort(A);
	}

	public static void quickSort(SInteger[] A) {
		quickSort(A, 0, A.length - 1);
	}

	public static void quickSort(SInteger[] A, int left, int right) {
		if (left < right) {
			int p = partition(A, left, right);
			System.out.println("p = " + p);
			quickSort(A, left, p - 1);
			quickSort(A, p + 1, right);
		}
	}
}