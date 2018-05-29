package basicAlgo;

import java.util.Random;

public class FindPivotElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 7, 9};
        findPivotElementInArray(arr);
    }

    private static void findPivotElementInArray(int[] arr) {
        System.out.println("arr = " + partition(arr,0,arr.length-1));
    }

    private  static int partition(int[] G, int first, int last) {
        int pivot = first + new Random().nextInt(last - first + 1);
        swap(G, last, pivot);
        for (int i = first; i < last; i++) {
            if (G[i] > G[last]) {
                swap(G, i, first);
                first++;
            }
        }
        swap(G, first, last);
        return first;
    }
    private static void swap(int[] G, int x, int y) {
        int tmp = G[x];
        G[x] = G[y];
        G[y] = tmp;
    }
}
