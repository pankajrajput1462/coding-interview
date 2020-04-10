package collections.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class RearrangeArrayTest {

    @Test
    void rearrange() {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        RearrangeArray.rearrange(arr, arr.length);
        System.out.println("Array after rearranging: ");
        for (int i : arr) {
            log.info("{}", i);
        }
        assertEquals(4, arr[0]);
        assertEquals(-3, arr[1]);
        assertEquals(9, arr[8]);
    }
}