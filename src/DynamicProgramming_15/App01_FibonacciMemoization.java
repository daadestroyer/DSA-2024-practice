package DynamicProgramming_15;

import java.util.Arrays;

public class App01_FibonacciMemoization {
    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            // it means we have already stored answer for dp[n];
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // 0 1 1 2 3 5 8
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));

        /*
            TC : O(N)
            SC : O(N)
        */
    }
}
