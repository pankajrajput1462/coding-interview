package sorting.quickselect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickMinTest {

    @Test
    void kThMinimumTest() {
        int[] list = {33, 89, 7, 6, 7, 56, 47, 64, 4};
        assertEquals(4, QuickMin.kThMinimum(list, 0));
    }
}