package DynamicProgramming_15.DP_On_SubSequences_03;

import java.util.Arrays;

public class App08_TargetSum_494 {
    public static int findSol(int idx, int[] nums, int target, int[][] dp) {
        if (idx == nums.length) {
            if (target == 0) return 1;
            else return 0;
        }
        if (dp[idx][target] != -1) return dp[idx][target];

        int pick = 0;
        if (nums[idx] <= target) {
            pick = findSol(idx + 1, nums, target - nums[idx], dp);
        }
        int nonPick = findSol(idx + 1, nums, target, dp);

        dp[idx][target] = pick + nonPick;

        return dp[idx][target];


    }

    public static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }
        if ((totalSum + target) % 2 != 0 || Math.abs(target) > totalSum) return 0;

        int subSetSum = (totalSum + target) / 2;
        int[][] dp = new int[n][subSetSum + 1];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return findSol(0, nums, subSetSum, dp);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}
