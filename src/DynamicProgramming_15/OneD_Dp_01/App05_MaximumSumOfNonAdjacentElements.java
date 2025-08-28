package DynamicProgramming_15.OneD_Dp_01;

import java.util.Arrays;

public class App05_MaximumSumOfNonAdjacentElements {
    public static int findMax(int index, int[] nums, int[] dp) {
        if (index == 0) {
            return nums[0];
        }
        if (index < 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int pick = nums[index] + findMax(index - 2, nums, dp);
        int notPick = findMax(index - 1, nums, dp);
        int max = Math.max(pick, notPick);
        dp[index] = max;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 9};
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int maxRes = findMax(n - 1, nums, dp);
        System.out.println(maxRes);
    }
}
