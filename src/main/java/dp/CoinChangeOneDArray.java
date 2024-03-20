package dp;

/* Dynamic Programming Java implementation of Coin
Change problem */

public class CoinChangeOneDArray {
    static long count(int[] coins, int n, int sum) {
        // dp[i] will be storing the number of solutions for
        // value i. We need sum+1 rows as the dp is
        // constructed in bottom up manner using the base case
        // (sum = 0)
        int[] dp = new int[sum + 1];

        // Base case (If given value is 0)
        dp[0] = 1;

        // Pick all coins one by one and update the dp[]
        // values after the index greater than or equal to the
        // value of the picked coin
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= sum; j++)
                dp[j] += dp[j - coins[i]];
        print(dp);
        return dp[sum];
    }

    private static void print(int[] dp) {
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver Function to test above function
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int n = coins.length;
        int sum = 10;
        System.out.println(count(coins, n, sum));
    }
}

