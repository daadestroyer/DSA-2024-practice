package DynamicProgramming_15.DP_ON_LIS_06;

import java.util.Arrays;

public class App02_PrintLongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = nums.length;

        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int maxLen = 1, lastIndex = 0;

        // Build dp and parent arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {

                }
            }
        }
    }
}
