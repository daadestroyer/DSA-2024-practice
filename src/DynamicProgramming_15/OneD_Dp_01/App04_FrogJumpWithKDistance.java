package DynamicProgramming_15.OneD_Dp_01;

import java.util.Arrays;

public class App04_FrogJumpWithKDistance {
    public static int frogJumpWithKDist(int index, int[] height, int k, int[] dp) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int minDist = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (index - j >= 0) {
                int jump = frogJumpWithKDist(index - j, height, k, dp) + Math.abs(height[index] - height[index - j]);
                minDist = Math.min(minDist, jump);
            }
            dp[index] = minDist;
        }
        return minDist;
    }

    public static void main(String[] args) {
        int[] height = {10, 30, 40, 50, 20};
        int n = height.length;
        int k = 3;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int result = frogJumpWithKDist(n - 1, height, k, dp);
        System.out.println(result);

        /*
            Time Complexity:
            ----------------
            --> for each index j we are looping k times (k jumps) O(k)
            --> we are iterating to whole height array O(n)

            Total : O(N*K)

            Space Complexity:
            -----------------
            --> DP Array of size n - O(N)
            --> Recursion stack depth --> O(N)

            Total : O(N)


        */
    }
}
