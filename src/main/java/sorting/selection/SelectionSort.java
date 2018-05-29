package sorting.selection;

public class SelectionSort {

	public static int[] selectionSort(int[] ar) {
		int len = ar.length - 1;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = 0; j < len; j++)
				if (ar[j] < ar[min])
					min = i;

		}
		return ar;

	}
}
