package DynamicProgramming_15.TwoD_ThreeD_DP_DP_On_Grids_02;

import java.util.Arrays;

public class App09_UniquePaths_Obstacles_63 {
    public static int findSol(int startRow, int startCol, int endRow, int endCol, int[][] dp, int[][] grid) {
        if (startRow == endRow && startCol == endCol) {
            return grid[startRow][startCol] == 1 ? 0 : 1;
        }
        if (startRow > endRow || startCol > endCol) {
            return 0;
        }
        if (grid[startRow][startCol] == 1) {
            return 0;
        }
        if (dp[startRow][startCol] != -1) {
            return dp[startRow][startCol];
        }

        int ans1 = findSol(startRow + 1, startCol, endRow, endCol, dp, grid);
        int ans2 = findSol(startRow, startCol + 1, endRow, endCol, dp, grid);
        int total = ans1 + ans2;
        dp[startRow][startCol] = total;
        return total;

    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        int endRow = grid.length;
        int endCol = grid[0].length;
        int[][] dp = new int[endRow][endCol];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int ans = findSol(0, 0, endRow - 1, endCol - 1, dp, grid);
        System.out.println(ans);

        /*
            Time Complexity :
            ------------------
            Problem size: m x n grid
            Each cell (row, col) is computed once due to memoization (dp[row][col] stores result).
            Each cell does constant work (just 2 recursive calls + addition).
            Time Complexity = O(m × n)

            Space Complexity :
            -------------------
            DP Table: dp[m][n] → O(m × n)
            Recursion stack: In the worst case, recursion goes along one path from (0,0) to (m-1,n-1)
            → depth = (m + n - 1)
            → O(m+n)
            Space Complexity = O(m × n) + O(m+n)

        */

    }
}
