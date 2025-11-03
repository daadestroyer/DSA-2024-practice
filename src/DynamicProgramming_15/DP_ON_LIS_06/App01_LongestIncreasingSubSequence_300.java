package DynamicProgramming_15.DP_ON_LIS_06;

import java.util.Arrays;

public class App01_LongestIncreasingSubSequence_300 {
    public static int findLIS(int idx, int prev_idx, int[] nums, int[][] dp) {
        if (idx == nums.length) {
            return 0;
        }
        int res = 0;
        // not pick
        int len1 = findLIS(idx + 1, prev_idx, nums, dp);

        // pick
        int len2 = 0;
        if (prev_idx == -1 || nums[idx] > nums[prev_idx]) {
            len2 = 1 + findLIS(idx + 1, idx, nums, dp);
        }
        res = Math.max(len1, len2);
        dp[idx][prev_idx + 1] = res;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = nums.length;
        // taking -1 because prev_idx we have taken from -1
        int[][] dp = new int[n][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int len = findLIS(0, -1, nums, dp);
        System.out.println(len);
        for(int[] arr : dp){
            System.out.println(Arrays.toString(arr));
        }

    }
}
