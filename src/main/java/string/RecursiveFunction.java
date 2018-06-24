package string;

/**
 * Created by psi143 on 11/14/2016.
 */
public class RecursiveFunction {


    public static void fibonacciSeries(int number) {
        System.out.printf("\nFibonacci series in Java of number %s using recursion %n", number);
        for (int i = 1; i <= number; i++) {
            System.out.printf("%s ", getFibonacci(i));
        }
    } /* * Fibonacci series in Java of a given number Recursion. */

    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }


    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        //int n = 9;
        // System.out.println(fib(n));
        fibonacciSeries(30);
    }
}
