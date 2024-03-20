package pan.org.usecase;

import collections.array.SecondLargestInArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {

    @Test
    void test() {
        SecondLargestInArray secondLargestInArray = new SecondLargestInArray();
        int[] arr = {4, 6, 7, 66, 1, 0, -4};
        final int[] upperMaxValue = secondLargestInArray.findUpperMaxValue(arr);
        assertEquals(66, upperMaxValue[0]);
        assertEquals(7, upperMaxValue[1]);
    }

}
