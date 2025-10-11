package DynamicProgramming_15.DP_ON_Stocks_05;

import java.util.Arrays;

public class App02_BestTimeToBuyAndSellStock_MULTIPLE_TRANSACTIONS_ALLOWED_122 {
    public static int maxProfit(int idx, int canBuy, int[] prices, int[][] dp) {
        if (idx == prices.length) return 0;
        if (dp[idx][canBuy] != -1) return dp[idx][canBuy];

        int profit = 0;
        // buy
        if (canBuy == 1) {
            // now we have 2 opportunity
            // op : 1 if price is less we can buy it
            // op : 2 if price is more we can ignore it
            // buy it as of now
            int buy = -prices[idx] + maxProfit(idx + 1, 0, prices, dp); // here you buy it, next time you have to sell to sending 0

            // skip it as of now because stock price is may be high
            int skip = maxProfit(idx + 1, 1, prices, dp); // here you skip it so next time you have opportunity to buy so sending 1
            profit = Math.max(buy, skip);
        }
        // can not buy
        else {
            // now again we have 2 opportunity
            // op : 1 if current price is higher you can sell it & make good profit
            // op : 2 if current price is less you can skip it & won't sell it

            int sell = prices[idx] + maxProfit(idx + 1, 1, prices, dp); // you sell it so next time you have to buy so sending 1
            int skip = maxProfit(idx + 1, 0, prices, dp); // you didn't sell so next time you can't buy before selling so sending 0
            profit = Math.max(sell, skip);
        }
        dp[idx][canBuy] = profit;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[][] dp = new int[prices.length][2]; // 2 because you have two option at each index either buy or sell it
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        // first time sending 1 because till now you didn't buy anything, so to sell you have to buy something
        int maxProfit = maxProfit(0, 1, prices, dp);
        System.out.println(maxProfit);
    }
}
