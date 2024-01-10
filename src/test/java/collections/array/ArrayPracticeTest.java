package collections.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayPracticeTest {

    @Test
    public void findMissingNumber() {
        int missingNumber = getMissingNumber();
        Assertions.assertEquals(4, missingNumber);
    }

    private int getMissingNumber() {
        int[] arr = {3, 5, 6, 8};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        int j = arr[0];
//        3|5|6|8
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return 0;
    }
}
