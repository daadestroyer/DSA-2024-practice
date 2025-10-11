package DynamicProgramming_15.DP_ON_Stocks_05;

public class App01_BestTimeToBuyAndSellStock_121 {
    public static int findMaxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
        int min_stock_price = Integer.MAX_VALUE;
        for (int price : prices) {
            min_stock_price = Math.min(min_stock_price, price);
            max_profit = Math.max(max_profit, price - min_stock_price);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = findMaxProfit(prices);
        System.out.println("Max Profit Is : "+maxProfit);
        // TC : O(n) , SC:O(1)
    }
}
