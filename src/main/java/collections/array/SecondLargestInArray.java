package collections.array;

public class SecondLargestInArray {

    public static int[] findUpperMaxValue(final int[] array) {
        int[] value = new int[2];
        int largest = 0;
        int secLargest = 0;

        for (int i : array) {
            if (largest < i) {
                secLargest = largest;
                largest = i;
            } else if (secLargest < i) {
                secLargest = i;
            }
        }

        value[0] = secLargest;
        value[1] = largest;

        return value;

    }

}
