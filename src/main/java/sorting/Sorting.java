package sorting;

public class Sorting {

	public static int[] bubbleSort(int arr[]) {

		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;

	}

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
