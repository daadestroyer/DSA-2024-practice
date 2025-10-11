package DynamicProgramming_15.DP_ON_Stocks_05;

import java.util.Arrays;

public class App04_BestTimeToBuyAndSellStock_K_TRANSACTION_ALLOWED_188 {
    public static int maxProfit(int idx, int canBuy, int transactionAllowed, int[] prices, int[][][] dp) {
        if (idx == prices.length || transactionAllowed == 0) {
            return 0;
        }
        if (dp[idx][canBuy][transactionAllowed] != -1) return dp[idx][canBuy][transactionAllowed];
        int profit = 0;
        if (canBuy == 1) {
            // now we have 2 opportunity
            // op : 1 if price is less we can buy it
            // op : 2 if price is more we can ignore it
            // buy it as of now
            int buy = -prices[idx] + maxProfit(idx + 1, 0, transactionAllowed, prices, dp);

            // skip it as of now because stock price is may be high
            int skip = maxProfit(idx + 1, 1, transactionAllowed, prices, dp);
            profit = Math.max(buy, skip);
        }
        // sell
        else {
            // now again we have 2 opportunity
            // op : 1 if current price is higher you can sell it & make good profit
            // op : 2 if current price is less you can skip it & won't sell it
            // you sell it so next time you have to buy so sending 1
            int sell = prices[idx] + maxProfit(idx + 1, 1, transactionAllowed - 1, prices, dp);

            // you didn't sell so next time you can't buy before selling so sending 0
            int skip = maxProfit(idx + 1, 0, transactionAllowed, prices, dp);
            profit = Math.max(sell, skip);
        }
        dp[idx][canBuy][transactionAllowed] = profit;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        int k = 2;
        int[][][] dp = new int[prices.length][2][k + 1];
        for (int[][] arr : dp) {
            for (int[] arr1 : arr) {
                Arrays.fill(arr1, -1);
            }
        }
        System.out.println(maxProfit(0, 1, k, prices, dp));
        /*
            Time Complexity:
            ----------------
            Each state is computed once due to memoization.
	        Each state does O(1) work (a few recursive calls + max).
            TC :  O(n * 2 * (k + 1)) = O(n * k)

            Space Complexity:
            ---------------
            Two components:
	        1.	DP table:
                O(n * 2 * (k + 1)) = O(n * k)
	        2.	Recursion stack:
	            Max depth = n (one recursive call per day) O(n)

	        Total auxiliary space = O(n * k + n) = O(n * k)
        */
    }
}
