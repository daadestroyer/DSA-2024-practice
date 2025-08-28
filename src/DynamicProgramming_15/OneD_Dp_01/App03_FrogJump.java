package DynamicProgramming_15.OneD_Dp_01;

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

        /*
            Time Complexity :
            -----------------
            For each index n, we check two possibilities:
	            •	Jump from n-1
	            •	Jump from n-2
	            So, total work per state = O(1).
                Number of states = n.

                Time Complexity = O(n)


            Space Complexity :
            ------------------
            There are two types of space usage here:
                1. DP Array (dp) → size n → O(n)
	            2.Recursion Call Stack
	                •	In the worst case, the recursion depth goes down to n.
	                •	So stack space = O(n).

	            Space Complexity = O(n) + O(n) = O(n)

        */
    }
}
