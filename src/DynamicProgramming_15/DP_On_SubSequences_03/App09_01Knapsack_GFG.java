package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App09_01Knapsack_GFG {
    public static int findSol(int idx, int[] wt, int[] val, int cap, int[][] dp) {
        if (idx == 0) {
            if (wt[idx] <= cap) {
                return val[idx];
            } else {
                return 0;
            }
        }
        if (dp[idx][cap] != -1) return dp[idx][cap];
        int pick = 0;
        if (wt[idx] <= cap) {
            pick = val[idx] + findSol(idx - 1, wt, val, cap - wt[idx], dp);
        }
        int nonPick = findSol(idx - 1, wt, val, cap, dp);
        dp[idx][cap] = Math.max(pick, nonPick);
        return dp[idx][cap];
    }

    public static int knapSack(int W, int[] val, int[] wt) {
        int n = wt.length;
        int[][] dp = new int[n][W + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return findSol(n - 1, wt, val, W, dp);
    }

    public static void main(String[] args) {
        int W = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        System.out.println(knapSack(W, val, wt));
    }
}
