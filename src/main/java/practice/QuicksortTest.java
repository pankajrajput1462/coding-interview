package practice;

import java.util.Arrays;
import java.util.Random;


public class QuicksortTest {
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] toSort = {40,20,10,80,60,50,7,30,100};
        sorter.sort(toSort);
        for (int i : toSort) {
            System.out.println(i);
        }
    }
}