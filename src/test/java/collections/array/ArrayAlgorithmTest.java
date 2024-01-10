package collections.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayAlgorithmTest {

    ArrayAlgorithm arrayAlgorithm;

    @BeforeEach
    void setUp() {
        arrayAlgorithm = new ArrayAlgorithm();
    }

    @Test
    void sortBasedOnZero() {
        int[] booleans = {1, 0, 1, 0, 1, 0, 0, 1};
        int[] expected = {0, 0, 0, 0, 1, 1, 1, 1};
        assertArrayEquals(expected, arrayAlgorithm.sortBasedOnZero(booleans));
    }

    @Test
    void sortBasedOnZero1() {
    }

    @Test
    void evenOddFinder() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        arrayAlgorithm.evenOddFinder(arr);
    }

    @Test
    void delete() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        arrayAlgorithm.deleteElement(arr, 8);
        Arrays.stream(arr).forEach(System.out::println);
    }

    @Test
    void deleteElement() {
    }

    @Test
    void leftRotate() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        arrayAlgorithm.leftRotate(arr, 2);
        Stream.of(arr).forEach(System.out::println);
    }

    @Test
    void removeElements() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        int[] ints = arrayAlgorithm.removeElements(arr, 8);
        int[] expected = new int[]{5, 9, 66, 3, 7};
        Assertions.assertArrayEquals(expected, ints);
        Arrays.stream(ints).forEach(System.out::println);
    }

    @Test
    void missingNumberTest() {
        int[] arr = {5, 8, 9, 66, 3, 7, 8};
        arrayAlgorithm.getMissingNo(arr, 4);
    }
}