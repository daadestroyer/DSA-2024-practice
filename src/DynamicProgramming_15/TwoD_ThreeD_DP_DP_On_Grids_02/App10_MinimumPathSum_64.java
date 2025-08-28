package DynamicProgramming_15.TwoD_ThreeD_DP_DP_On_Grids_02;

import java.util.Arrays;

public class App10_MinimumPathSum_64 {
    public static int findSol(int startRow, int startCol, int endRow, int endCol, int[][] dp, int[][] grid) {
        if (startRow == endRow && startCol == endCol) {
            return grid[startRow][startCol];
        }
        if (startRow > endRow || startCol > endCol) {
            return Integer.MAX_VALUE;
        }
        if (dp[startRow][startCol] != -1) {
            return dp[startRow][startCol];
        }
        int ans1 = findSol(startRow + 1, startCol, endRow, endCol, dp, grid);
        int ans2 = findSol(startRow, startCol + 1, endRow, endCol, dp, grid);

        int min = Math.min(ans1, ans2);
        // because we need sum that's why adding min with grid[startRow][startCol];
        dp[startRow][startCol] = grid[startRow][startCol] + min;
        return dp[startRow][startCol];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int endRow = grid.length;
        int endCol = grid[0].length;
        int[][] dp = new int[endRow][endCol];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findSol(0, 0, endRow - 1, endCol - 1, dp, grid));

        /*
            Time Complexity:
            ----------------
            Each cell (row, col) is visited at most once, because results are stored in dp[row][col].
            For each cell, you do:
                At most 2 recursive calls (down & right).
                Constant-time operations (min, +, assignment).
            Time Complexity = O(m × n)

            Space Complexity:
            ----------------
            DP Table:
	            dp[m][n] stores results → O(m × n)

	        Recursion stack:
                In the worst case, recursion depth = (m + n - 1)
	            → O(m+n)
	        Space Complexity = O(m × n) + O(m+n)

        */
    }
}
