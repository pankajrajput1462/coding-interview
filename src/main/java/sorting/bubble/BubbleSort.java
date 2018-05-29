package sorting.bubble;

public class BubbleSort {

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
}
