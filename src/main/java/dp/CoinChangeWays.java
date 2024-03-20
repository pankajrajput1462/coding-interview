package dp;

import java.util.*;

public class CoinChangeWays {
    // Returns total distinct ways to make sum using n coins of
    // different denominations
    static int count(List<Integer> coins, int n, int sum) {
        // 2D dp array where n is the number of coin
        // denominations and sum is the target sum
        int[][] dp = new int[n + 1][sum + 1];

        // Represents the base case where the target sum is 0,
        // and there is only one way to make change: by not
        // selecting any coin
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                // Add the number of ways to make change without
                // using the current coin
                dp[i][j] += dp[i - 1][j];

                if ((j - coins.get(i - 1)) >= 0) {
                    // Add the number of ways to make change
                    // using the current coin
                    dp[i][j] += dp[i][j - coins.get(i - 1)];
                }
            }
        }
        printArray(dp);
        return dp[n][sum];
    }

    private static void printArray(int[][] dp) {
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 3);
        int n = 3;
        int sum = 5;
        System.out.println(count(coins, n, sum));
    }
}

