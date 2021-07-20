package collections.array;

import java.util.Arrays;

public class ArrayAlgorithm implements ArrayAlgorithmBasicAlgo {
    /**
     * program  for sorting an array by 0 ,1 or so on
     */
    public int[] sortBasedOnZero(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                swap(arr, i, k);
                k++;
            }
        }
        return arr;
    }

    /**
     * Delete element from array in generic way
     */
    public static void deleteElement(int[] arr, int ele) {
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
    public static void leftRotate(int[] arr, int rotationNumber) {

        int len = arr.length;
        for (int j = 0; j < rotationNumber; j++) {
            leftRotateByOne(arr, len);
        }
    }

    private static void leftRotateByOne(int[] arr, int len) {
        int j, temp;
        temp = arr[0];
        for (j = 0; j < len - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[j] = temp;
    }

    /**
     * Find odd and even no in array
     */
    public void evenOddFinder(int[] arr) {
        int length = arr.length;
        /*
        For tracking the last index number where we have to swap the coming even number
         */
        int i = 0;
        for (int j = 0; j != length; j++) {
            if (arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
            }
        }
        for (int anArr : arr) {
            System.out.println("Even Odd : " + anArr);
        }
    }


    public static int[] removeElements(int[] arr, int key) {
        // Move all other elements to beginning
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];

        // Create a copy of arr[]
        return Arrays.copyOf(arr, index);
    }

    public int getMissingNo(int[] a, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

}
