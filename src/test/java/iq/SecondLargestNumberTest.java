package iq;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestNumberTest {

    static SecondLargestNumber secondLargestNumber;

    @BeforeAll
    static void init() {
        secondLargestNumber = new SecondLargestNumber();
    }

    @Test
    void secondLargestNumberTest() throws ArrayListNotValid {
        int[] arr = {12, 35, 1, 10, 34, 1};
        assertEquals(34, secondLargestNumber.secondLargestNumber(arr));


    }

    @Test
    void secondLargestNumberExceptionTest() {
        int[] arr = {12};
        assertThrows(ArrayListNotValid.class, () -> secondLargestNumber.secondLargestNumber(arr));

    }

}