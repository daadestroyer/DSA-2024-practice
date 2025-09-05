package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App07_CoinChange_518_infinite_coin_and_return_number_of_combinations_that_make_up_that_amount {

    public static int findCombinations(int idx, int[] coins, int amount, int[][] dp) {
        if (idx == coins.length) {
            if (amount == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }
        int pick = 0;
        if (coins[idx] <= amount) {
            // not doing idx+1 as we have infinite supply
            pick = findCombinations(idx, coins, amount - coins[idx], dp);
        }
        int nonPick = findCombinations(idx + 1, coins, amount, dp);
        dp[idx][amount] = pick+nonPick; // storing total count
        return dp[idx][amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[coins.length][amount + 1];
        for(int i=0 ; i<coins.length;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(findCombinations(0, coins, amount, dp));

    }
}
