package pan.org.usecase;

import collections.array.SecondLargestInArray;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberTest {

    @Test
    public void test() {
        SecondLargestInArray secondLargestInArray = new SecondLargestInArray();
        int[] arr = {4, 6, 7, 66, 1, 0, -4};
        final int[] upperMaxValue = secondLargestInArray.findUpperMaxValue(arr);
        Assertions.assertEquals(7, upperMaxValue[0]);
    }

}
