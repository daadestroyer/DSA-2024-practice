package DynamicProgramming_15;

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
    }
}
