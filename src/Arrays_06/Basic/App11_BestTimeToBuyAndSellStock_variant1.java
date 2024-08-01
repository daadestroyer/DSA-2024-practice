package Arrays_06.Basic;

public class App11_BestTimeToBuyAndSellStock_variant1 {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        // if i purchase on day 2 at price 1 and sell at day 5 at 6 then profit will be 5 which is max
        // 1 <= prices.length <= 105
        // 0 <= prices[i] <= 104

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i : price) {
            minPrice = Math.min(i, minPrice);
            maxProfit = Math.max(maxProfit, i - minPrice);
        }
        System.out.println(maxProfit);
    }
}
