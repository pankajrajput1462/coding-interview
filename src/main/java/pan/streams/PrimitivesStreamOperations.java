package pan.streams;

import java.util.Arrays;

public class PrimitivesStreamOperations {
    public static void main(String[] args) {

        int[] integers=new  int[]{20,98,12,7,35};
        Arrays.stream(integers).min().getAsInt();

        int sum = Arrays.asList(33,45)
                .stream()
                .mapToInt(i -> i)
                .sum();
    }
}
