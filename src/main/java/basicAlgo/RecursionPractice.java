package basicAlgo;

public class RecursionPractice {
    public static void main(String[] args) {

        int [] arr={44,5,66,56};
        int n = arr.length;
       int sum= linearSum(arr, n);
        System.out.println(sum);
    }

    private static int linearSum(int[] arr ,int n) {

            if (n==1)
            {
                return arr[0];
            }
            else {
                return linearSum(arr, n - 1) + arr[n - 1];
            }
        }


}
