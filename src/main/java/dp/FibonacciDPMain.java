package dp;

public class FibonacciDPMain {
    public static void main(String[] args) {
        int n = 10;
        int[] fib = fib(n);
        for (int i : fib) {
            System.out.print(i + " ");
        }
    }

    private static int[] fib(int n) {

        int[] f = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f;
    }
}
