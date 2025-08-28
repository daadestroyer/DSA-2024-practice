package DynamicProgramming_15.TwoD_ThreeD_DP_DP_On_Grids_02;

import java.util.Arrays;

public class App07_NinjaTraining {
    public static int findSolution(int day, int last, int[][] dp, int[][] matrix) {
        if (day == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, matrix[0][task]);
                }
            }
            return maxi;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }

        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            int points = matrix[day][task] + findSolution(day - 1, task, dp, matrix);
            maxi = Math.max(maxi, points);
        }
        dp[day][last] = maxi;
        return maxi;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int day = matrix.length;
        int[][] dp = new int[day][4];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        int res = findSolution(day - 1, 3, dp, matrix); // 3 is total task
        System.out.println(res);

        /*
            Time Complexity :
            ------------------
            You have day (rows) and last (4 possibilities: {0,1,2,3}).
            Each state (day, last) is computed once and stored in dp.
            For each state, you try up to 3 tasks.
            T(n) = O(day \times 4 \times 3) = O(12 \times day) = O(day)
            Time Complexity = O(n) where n = number of days.

            Space Complexity :
            ------------------
            Recursion stack space → In worst case, depth = day → O(day).
            DP table → dp[day][4] → O(4n) = O(n).
            S(n) = O(n) \; (\text{DP}) + O(n) \; (recursion stack) = O(n)

        */
    }
}
