package DynamicProgramming_15.DP_ON_Stocks_05;

import java.util.Arrays;

public class App05_BestTimeToBuyAndSellStock_WITH_COOLDOWN_309 {
    public static int findMaxProfit(int idx, int canBuy, int[] prices, int[][] dp) {
        if (idx >= prices.length) return 0;
        if (dp[idx][canBuy] != -1) return dp[idx][canBuy];

        int profit = 0;
        // buy
        if (canBuy == 1) {
            int buy = -prices[idx] + findMaxProfit(idx + 1, 0, prices, dp);
            int skip = findMaxProfit(idx + 1, 1, prices, dp);
            profit = Math.max(buy, skip);
        }
        // sell
        else {
            // cooldown state
            // after sell you can not buy on next day so doing idx+2 to buy on next to next day
            int sell = prices[idx] + findMaxProfit(idx + 2, 1, prices, dp);
            int skip = findMaxProfit(idx + 1, 0, prices, dp);
            profit = Math.max(sell, skip);
        }
        dp[idx][canBuy] = profit;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        int n = prices.length;
        int canBuy = 1;
        // taking 2 because you have two options buy or sell
        int[][] dp = new int[n][2];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findMaxProfit(0, canBuy, prices, dp));
        /*
            Time Complexity:
            ----------------
            Each state (idx, canBuy) is computed once.
	        Each computation does O(1) work (a few Math.max operations and recursive calls).
	        Even with the idx + 2 jump for cooldown, each state is visited only once.
	        TC :  O(n)

            Space Complexity:
            ---------------
            Two parts:
	        DP array: int[n][2] → O(2n) → O(n)
	        Recursion stack: worst-case depth = n → O(n)
            SC :  O(n) (DP) + O(n) (stack) = O(n)
        */
    }
}
