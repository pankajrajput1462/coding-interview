package sorting.quickselect;

/**
 * Find min in unsorted array
 */
public class QuickMin {

    static int kThMinimum(int[] list, int k) {
        int left = 0;
        int right = list.length - 1;
        while (true) {
            int pivIndex = (left + right) / 2;
            int newPiv = partition(list, left, right, pivIndex);
            if (newPiv == k)
                return list[newPiv];
            else if (newPiv < k) {
                left = newPiv + 1;
            } else {
                right = newPiv - 1;
            }
        }
    }

    private static int partition(int[] list, int left, int right, int pivot) {
        int pivValue = list[pivot];
        swap(list, pivot, right); // put pivot value on the end
        int storePos = left;
        for (int i = left; i < right; i++) {
            if (list[i] < pivValue) {
                swap(list, i, storePos);
                storePos++;
            }
        }
        swap(list, storePos, right);
        return storePos;
    }

    private static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;

    }
}