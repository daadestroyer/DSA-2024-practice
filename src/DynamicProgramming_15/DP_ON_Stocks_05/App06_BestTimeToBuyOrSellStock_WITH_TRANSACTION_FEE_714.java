package DynamicProgramming_15.DP_ON_Stocks_05;

import java.util.Arrays;

public class App06_BestTimeToBuyOrSellStock_WITH_TRANSACTION_FEE_714 {
    public static int findMaxProfit(int idx, int canBuy, int fee, int[] prices, int[][] dp) {
        if (idx == prices.length) return 0;
        if (dp[idx][canBuy] != -1) return dp[idx][canBuy];

        int profit = 0;
        // buy
        if (canBuy == 1) {
            int buy = -prices[idx] + findMaxProfit(idx + 1, 0, fee, prices, dp);
            int skip = findMaxProfit(idx + 1, 1, fee, prices, dp);
            profit = Math.max(buy, skip);
        }
        // sell
        else {
            int sell = prices[idx] - fee + findMaxProfit(idx + 1, 1, fee, prices, dp);
            int skip = findMaxProfit(idx + 1, 0, fee, prices, dp);
            profit = Math.max(sell, skip);
        }
        dp[idx][canBuy] = profit;
        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int canBuy = 1;
        int[][] dp = new int[prices.length][2];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findMaxProfit(0, 1, fee, prices, dp));
    }
}
