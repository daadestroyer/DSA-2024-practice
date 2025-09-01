package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App04_CountSubSetsWithSumK_GFG {
    public static int countSubSet(int idx, int[] arr, int target, int[][] dp) {
        if (target == 0) return 1;
        if (idx == arr.length) return 0;

        if (dp[idx][target] != -1) {
            return dp[idx][target];
        }
        // pick
        int pick = 0;
        if (arr[idx] <= target) {
            pick = countSubSet(idx + 1, arr, target - arr[idx], dp);
        }
        // not pick
        int notPick = countSubSet(idx + 1, arr, target, dp);

        dp[idx][target] = pick + notPick;
        return dp[idx][target];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int[][] dp = new int[arr.length][target + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(countSubSet(0, arr, target, dp));
    }
}
