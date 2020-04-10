package collections.array;

/*
 A JAVA program to put positive numbers at even indexes
 (0, 2, 4,..) and negative numbers at odd indexes (1, 3,
 5, ..)
*/

public class RearrangeArray {

    /*
     The main function that rearranges elements of given
     array.  It puts positive elements at even indexes (0,
     2, ..) and negative numbers at odd indexes (1, 3, ..).
    */
    static void rearrange(int[] arr, int n) {
        // The following few lines are similar to partition
        // process of QuickSort.  The idea is to consider 0
        // as pivot and divide the array around it.
        int i = -1;
        int temp;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /*
         Now all positive numbers are at end and negative numbers at
         the beginning of array. Initialize indexes for starting point
         of positive and negative numbers to be swapped
        */
        int pos = i + 1;
        int neg = 0;

        /*
         Increment the negative index by 2 and positive index by 1, i.e.,
         swap every alternate negative number with next positive number
        */
        while (pos < n && neg < pos && arr[neg] < 0) {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }
}