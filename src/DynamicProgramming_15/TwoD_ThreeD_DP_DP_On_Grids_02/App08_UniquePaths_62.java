package DynamicProgramming_15.TwoD_ThreeD_DP_DP_On_Grids_02;

import java.util.Arrays;

public class App08_UniquePaths_62 {
    public static int findSol(int startRow, int startCol, int endRow, int endCol, int[][] dp) {
        if (startRow == endRow && startCol == endCol) {
            return 1;
        }
        if (startRow > endRow || startCol > endCol) {
            return 0;
        }
        if (dp[startRow][startCol] != -1) {
            return dp[startRow][startCol];
        }
        int ans1 = findSol(startRow + 1, startCol, endRow, endCol, dp);
        int ans2 = findSol(startRow, startCol + 1, endRow, endCol, dp);
        int total = ans1 + ans2;
        dp[startRow][startCol] = total;
        return total;

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int[][] dp = new int[m][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findSol(0, 0, m - 1, n - 1, dp));

        /*
            Time Complexity :
            ------------------
            Each state is (row, col).
            Maximum states = m × n (since grid is m x n).
            Each state is computed once and then memoized.
            Each state does 2 recursive calls at most (down + right), but after memoization it’s O(1).
            Time Complexity = O(m × n)

            Space Complexity:
            ------------------
            DP Table → dp[m][n] → O(m × n)
            Recursion stack → O(m+n).
            S(m, n) = O(m x n) + O(m+n)
            Space Complexity = O(m × n) + O(m+n)
        */
    }
}
