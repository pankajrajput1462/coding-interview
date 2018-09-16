package collections.tree.heap;

public class HeapSortMain {
    public static void main(String[] args) {

        int[] arr = {4, 33, 5, 6, 62, 2, 3, 5};
        heapSort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }

    }

    private static void heapSort(int[] arr) {
        int length = arr.length;
        //Build heap first
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, 0);
        }
        //one by one extract an element from top
        for (int i = length - 1; i >= 0; i--) {
            //move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; //Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //if left child is larger then root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        //if largest is not the root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            //heapify the subtree
            heapify(arr, n, largest);
        }

    }
}
