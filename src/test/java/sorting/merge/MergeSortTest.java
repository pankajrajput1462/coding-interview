package sorting.merge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        MergeSort mergeSort = new MergeSort();
        int[] values = {6, 8, 2, 9, 7, 88, 0, 6, 44};
        mergeSort.sort(values);
        for (int i = 0; i < values.length; i++) {
            System.out.println("values = " + values[i]);
        }
    }
}