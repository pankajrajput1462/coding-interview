package pan.org.usecase;

import collections.array.SecondLargestInArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    public void test() {
        SecondLargestInArray secondLargestInArray = new SecondLargestInArray();
        int[] arr = {4, 6, 7, 66, 1, 0, -4};
        final int[] upperMaxValue = secondLargestInArray.findUpperMaxValue(arr);
        Assertions.assertNotEquals(7, upperMaxValue[0]);
        Assertions.assertEquals(66, upperMaxValue[0]);
    }

}
