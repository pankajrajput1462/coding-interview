package sorting.quickselect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinNthElement {

    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 6, 7};
        int n1 = 2;
        int n2 = 8;
        int n3 = 9;
        final int nthMin1 = nthSmallestElement(arr, 0, arr.length - 1, n1);
        final int nthMin2 = nthSmallestElement(arr, 0, arr.length - 1, n2);
        final int nthMin3 = nthSmallestElement(arr, 0, arr.length - 1, n3);
        log.info("N/K th min value : {}",nthMin1);
        log.info("N/K th min value : {}",nthMin2);
        log.info("N/K th min value : {}",nthMin3);
    }

    private static int nthSmallestElement(int[] arr, int left, int right, int k) {

        //if k is smaller then no in Array
        if (k > 0 && k <= right - left + 1) {
            //partition the array
            int index = partition(arr, left, right);
            //if position is same as N
            if (index - left == k - 1) {
                return arr[index];
            }
            //if position is more then recur to left array
            if (index - left > k - 1)
                return nthSmallestElement(arr, left, index - 1, k);
            else
                return nthSmallestElement(arr, index + 1, right, k - index + left - 1);
        }
        //if k is more then no in element in the array
        return Integer.MAX_VALUE;
    }

    private static int partition(int[] arr, int left, int right) {
        int temp = arr[right];
        int i = left;
        for (int j = left; j < right - 1; j++) {
            if (arr[j] <= temp) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
            }
        }
        return i;
    }


}
