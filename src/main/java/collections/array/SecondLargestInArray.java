package collections.array;

public class SecondLargestInArray {

    public int[] findUpperMaxValue(final int[] array) {
        int[] value = new int[2];
        int largest = 0;
        int secLargest = 0;

        for (int indexValue : array) {
            if (indexValue > largest) {
                largest = indexValue;
                secLargest = largest;
            } else if (indexValue > secLargest) {
                secLargest = indexValue;
            }
        }

        value[0] = secLargest;
        value[1] = largest;

        return value;

    }

}
