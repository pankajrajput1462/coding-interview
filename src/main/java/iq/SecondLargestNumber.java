package iq;

public class SecondLargestNumber {
    public int secondLargestNumber(int[] arr) throws ArrayListNotValid {
        int i, first, second;

        int length = arr.length;
        if (length < 2) {
            throw new ArrayListNotValid("Array not valid");
        }
        first = second = Integer.MIN_VALUE;

        for (i = 0; i < length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.print("There is no second largest"
                    + " element\n");
            return -1;
        } else {
            System.out.print("The second largest element" + " is " + second);
        }
        return second;
    }

}
