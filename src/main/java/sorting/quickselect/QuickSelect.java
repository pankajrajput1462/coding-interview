package sorting.quickselect;

import java.util.Random;

/*
For find the max element in unsorted array

Best algo for quick select
 */
public class QuickSelect {

    public int quickselect(int[] arr, int nthMax) {
        return quickselect(arr, 0, arr.length - 1, nthMax - 1);
    }

    private int quickselect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivot = partition(arr, low, high);
            if (pivot == k) {
                return arr[k];
            }
            if (pivot > k) {
                return quickselect(arr, low, pivot - 1, k);
            }
            return quickselect(arr, pivot + 1, high, k);
        }
        return Integer.MIN_VALUE;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = low + (high - low)/2;
        swap(arr, high, pivot);
        for (int i = low; i < high; i++) {
            if (arr[i] > arr[high]) {
                swap(arr, i, low);
                low++;
            }
        }
        swap(arr, low, high);
        return low;
    }

    private void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

}
