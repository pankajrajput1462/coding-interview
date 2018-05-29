package collections.array;

public class ArrayAlgorithm {
    /**
     * program  for sorting an array by 0 ,1 or so on
     */
    public static int[] sortBasedOnZero(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        return arr;
    }

    /**
     * Delete element from array in generic way
     */
    private static void deleteElement(int[] arr, int ele) {
        int i = 0;

        for (; i < arr.length; i++) {
            if (ele == arr[i]) {
                break;
            }
        }
        for (int j = i; j < arr.length; j++) {
            arr[i] = arr[i + 1];
        }
    }

    /**
     * Program for array rotation
     * <p>
     * Rotate one by one
     */
    private int[] leftRotate(int arr[], int d, int n) {

        int i;
        int size = arr.length;
        for (int j = 0; j < d; j++) {
            leftRotateByOne(arr, size);
        }
        return arr;
    }

    private void leftRotateByOne(int[] arr, int size) {

        int j, temp;
        temp = arr[0];
        for (j = 0; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[j] = temp;
    }


}
