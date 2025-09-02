package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App05_CountPartitionsWithGivenDifference_GFG {
    public static int findSubSet(int idx, int[] arr, int target, int[][] dp) {
        if (idx == arr.length) {
            if (target == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[idx][target] != -1) return dp[idx][target];

        int pick = 0;
        if (arr[idx] <= target) {
            pick = findSubSet(idx + 1, arr, target - arr[idx], dp);
        }
        int notPick = findSubSet(idx + 1, arr, target, dp);
        dp[idx][target] = pick + notPick;
        return dp[idx][target];
    }

    public static int countPartitions(int[] arr, int d) {
        int n = arr.length;
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        // If (totalSum + d) is odd, no valid partition
        if ((totalSum + d) % 2 != 0) {
            return 0;
        }
        int target = (totalSum + d) / 2;
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return findSubSet(0, arr, target, dp);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 4};
        int d = 3;
        System.out.println(countPartitions(arr, d));
    }
}
