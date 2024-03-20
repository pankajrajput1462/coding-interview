package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class StreamTest {

    @Test
    void intRange() {
        int[] array = IntStream.range(2, 6).toArray();
        int[] expected = {2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, array);
    }
}
