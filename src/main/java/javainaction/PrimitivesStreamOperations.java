package javainaction;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrimitivesStreamOperations {
    public static void main(String[] args) {

        int[] integers = new int[]{20, 98, 12, 7, 35};
        int asInt = Arrays.stream(integers).min().getAsInt();
        System.out.println("asInt = " + asInt);

        int sum = Stream.of(33, 45)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);
    }
}
