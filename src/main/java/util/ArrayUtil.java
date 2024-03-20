package util;

public class ArrayUtil<T> {
    public static void printBolArray(boolean[][] arr) {
        for (boolean[] rows : arr) {
            for (boolean col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("******************************");
    }

    public static <T> void printArray(T[][] array) {
        for (T[] row : array) {
            for (T col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
