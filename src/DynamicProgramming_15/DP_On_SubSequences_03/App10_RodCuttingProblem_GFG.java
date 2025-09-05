package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App10_RodCuttingProblem_GFG {
    public static int findSol(int idx, int[] price, int rodLen, int[][] dp) {
        if (idx == 0) {
            return rodLen * price[0];
        }
        if (dp[idx][rodLen] != -1) return dp[idx][rodLen];

        int pick = Integer.MIN_VALUE;
        int pieceLen = idx + 1;
        if (pieceLen <= rodLen) {
            // we have unlimited supply of same len so not doing idx-1 here
            pick = price[idx] + findSol(idx, price, rodLen - pieceLen, dp);
        }

        int nonPick = findSol(idx - 1, price, rodLen, dp);

        dp[idx][rodLen] = Math.max(pick, nonPick);
        return dp[idx][rodLen];
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLen = price.length;
        int[][] dp = new int[rodLen + 1][rodLen + 1];
        for (int i = 0; i < price.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(findSol(price.length - 1, price, rodLen, dp));
    }
}
