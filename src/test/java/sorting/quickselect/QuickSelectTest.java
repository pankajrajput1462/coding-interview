package sorting.quickselect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {

    @Test
    public void quickSelectTest() {
        QuickSelect quickSelect = new QuickSelect();
        int[] arr = {3, 8, 2, 9, 4, 1,66,78,0};
        assertEquals(78,quickSelect.quickselect(arr, 1));
        assertEquals(66,quickSelect.quickselect(arr, 2));
        assertEquals(9,quickSelect.quickselect(arr, 3));
        assertEquals(8,quickSelect.quickselect(arr, 4));
        assertEquals(4,quickSelect.quickselect(arr, 5));
        assertEquals(3,quickSelect.quickselect(arr, 6));
    }

}