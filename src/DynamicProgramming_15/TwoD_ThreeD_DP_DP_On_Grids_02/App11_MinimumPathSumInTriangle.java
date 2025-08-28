package DynamicProgramming_15.TwoD_ThreeD_DP_DP_On_Grids_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11_MinimumPathSumInTriangle {
    public static int findSolMemoization(int row, int col, List<List<Integer>> triangle, int[][] dp) {
        // base case : if row reached to last row return the element
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        // down call
        int down = findSolMemoization(row + 1, col, triangle, dp);

        // down right call
        int downRight = findSolMemoization(row + 1, col + 1, triangle, dp);

        dp[row][col] = triangle.get(row).get(col) + Math.min(down, downRight);
        return dp[row][col];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findSolMemoization(0, 0, triangle, dp));
        /*
            Time Complexity:
            ---------------
            no of state = O(n * m)

            Space Complexity:
            ----------------
            O(n) -- recursion stack space
            O(n * m) -- dp array

        */
    }
}
