package DynamicProgramming_15.DP_ON_Stocks_05;

import java.util.Arrays;

public class App03_BestTimeToBuyAndSellStock_TWO_TRANSACTIONS_ALLOWED_123 {

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
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};

        // can only make 2 transactions(1 transaction means first buy then sell)
        // // 2 because you have two option at each index either buy or sell it
        int transactionAllowed = 2;


        // include cap dimension (0..2)
        // why did cap + 1 ? -->
        // idx cap = 2(means two txn left)
        // idx cap = 1 (means one txn left)
        // idx cap = 0 (means no txn left)
        int[][][] dp = new int[prices.length][2][transactionAllowed + 1];

        for (int[][] arr : dp) {
            for (int[] arr1 : arr) {
                Arrays.fill(arr1, -1);
            }
        }
        System.out.println(maxProfit(0, 1, transactionAllowed, prices, dp));
        /*
            Time Complexity:
            ----------------
            Each unique state is computed once and costs O(1) work.
            Total states = n * 2 * 3 = 6n →
            TC :  O(n) (constant factor 6 for k=2)

            Space Complexity:
            ---------------
            DP table: O(n * 2 * 3) = O(n)
	        Recursion stack: worst-case depth n → O(n)

	        SC :  O(n) (DP) + O(n) (stack) = O(n)
        */
    }
}
