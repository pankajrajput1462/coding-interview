package practice;

/**
 * Created by psi143 on 2/21/2017.
 */
public class QuickSort {
    private int[] numbers;
    private int length;

    public void sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        length = values.length;
        quicksort(0, length - 1);
    }

    private void quicksort(int low, int high) {
        int too_big_index = low, too_small_index = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (too_big_index <= too_small_index) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[too_big_index] < pivot) {
                too_big_index++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[too_small_index] > pivot) {
                too_small_index--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase too_big_index and too_small_index
            if (too_big_index <= too_small_index) {
                exchange(too_big_index, too_small_index);
                too_big_index++;
                too_small_index--;
            }
        }
        // Recursion
        if (low < too_small_index)
            quicksort(low, too_small_index);
        if (too_big_index < high)
            quicksort(too_big_index, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}