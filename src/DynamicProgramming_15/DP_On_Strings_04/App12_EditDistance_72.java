package DynamicProgramming_15.DP_On_Strings_04;

import java.util.Arrays;

public class App12_EditDistance_72 {
    public static int findEditDist(int i, int j, String s, String t, int[][] dp) {
        // if i get exhausted then s1 need j+1 operation to be like s2
        // basically i required insert operation
        if (i < 0) {
            return j + 1;
        }
        // if j get exhausted and if s1 want to be same as s2 then delete operation need to be perform
        // to delete element from s2
        if (j < 0) {
            return i + 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int res = 0;
        if (s.charAt(i) == t.charAt(j)) {
            res = findEditDist(i - 1, j - 1, s, t, dp);
        } else {
            int insert = 1 + findEditDist(i, j - 1, s, t, dp);
            int delete = 1 + findEditDist(i - 1, j, s, t, dp);
            int replace = 1 + findEditDist(i - 1, j - 1, s, t, dp);
            res = Math.min(insert, Math.min(delete, replace));
        }
        dp[i][j] = res;
        return res;

    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findEditDist(n - 1, m - 1, word1, word2, dp));
        /*
            Time Complexity:
            ---------------
            Each pair (i, j) is computed once because of memoization.
            There are n possible i values (0 … n-1)
            There are m possible j values (0 … m-1)
            TC : O(N * M)

            Space Complexity:
            -----------------
            There are two components:
	        DP Array: int[n][m] → O(n * m)
	        Recursion Stack: In the worst case, recursion depth = O(n + m)
	        Space Complexity = O(n *  m) = DP
	                           O(n + m) = Stack
        */
    }
}
