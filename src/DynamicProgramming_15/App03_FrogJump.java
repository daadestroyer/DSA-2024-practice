package DynamicProgramming_15;

import java.util.Arrays;

public class App03_FrogJump {
    public static int frogJump(int n, int[] heights, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        // left jump
        int leftAns = frogJump(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);

        // right jump
        int rightAns = Integer.MAX_VALUE;
        if (n > 1) {
            rightAns = frogJump(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }
        int min = Math.min(leftAns,rightAns);
        dp[n] = min;
        return min;

    }

    public static void main(String[] args) {
        int[] heights = {20, 30, 40, 20};
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = frogJump(n - 1, heights, dp);
        System.out.println(res);

    }
}
