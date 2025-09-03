package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App06_CoinChange_322_infinite_coin_supply_and_return_min_coin_required_to_meet_target {

    public static int findCoinCount(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0; // as if amount becomes zero now no coin needed so return 0

        if (amount < 0) return -1;

        if (dp[amount] != -2) return dp[amount];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int coinReq = findCoinCount(coins, amount - coins[i], dp);
            if (coinReq >= 0) {
                min = Math.min(min, coinReq + 1);
            }
        }
        dp[amount] = min == Integer.MAX_VALUE ? -1 : min;
        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-2);
        System.out.println(findCoinCount(coins, amount, dp));
        /*
         Time Complexity:
         ----------------
         -- iterating complete array = O(n)
         -- iterating till amount becomes 0 = O(amount)
            TC : O(n * amount)

         Space Complexity:
         ----------------
         dp array -- O(amount)
         recursion stack -- worst case = amount (e.g., if coins = [1], recursion subtracts 1 each step). O(amount)

         SC : O(amount)
        */
    }
}
