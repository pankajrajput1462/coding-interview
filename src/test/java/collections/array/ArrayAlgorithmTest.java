package collections.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sortBasedOnZero() {
        int[] booleans = {1, 0, 1, 0, 1, 0, 0, 1};
        int[] expected = {0, 0, 0, 0, 1, 1, 1, 1};
        assertArrayEquals(expected, ArrayAlgorithm.sortBasedOnZero(booleans));
    }

    @Test
    void sortBasedOnZero1() {
    }

    @Test
    void evenOddFinder() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        ArrayAlgorithm.evenOddFinder(arr);
    }
}