package collections.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxNumberThenTwoNumbersTest {

    @Test
    void findElements() {
        int[] arr = {2, -6, 3, 5, 1, 56, 24, 74, 2, 56};
        FindMaxNumberThenTwoNumbers.findElements(arr, arr.length);
    }
}