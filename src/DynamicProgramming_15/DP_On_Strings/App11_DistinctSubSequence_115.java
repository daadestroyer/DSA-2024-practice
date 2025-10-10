package DynamicProgramming_15.DP_On_Strings;

import java.util.Arrays;

public class App11_DistinctSubSequence_115 {
    public static int findDistSubSequence(int idx1, int idx2, String s, String t, int[][] dp) {
        // order of possitive base case matter
        // suppose i becomes 0 and j also becomes 0 in that case it should return 1
        // so first check idx2 if it is less than 0 means we found subsequence
        if (idx2 < 0) {
            return 1;
        }
        if (idx1 < 0) return 0;

        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }

        if (s.charAt(idx1) == t.charAt(idx2)) {
            dp[idx1][idx2] = findDistSubSequence(idx1 - 1, idx2 - 1, s, t, dp) + findDistSubSequence(idx1 - 1, idx2, s, t, dp);
        } else {
            dp[idx1][idx2] = findDistSubSequence(idx1 - 1, idx2, s, t, dp);
        }
        return dp[idx1][idx2];
    }

    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int res = findDistSubSequence(n - 1, m - 1, s, t, dp);
        System.out.println(res);
        /*
            Time Complexity:
            ----------------
            You have a recursive function with parameters (idx1, idx2) where:
            idx1 ranges from 0 to n-1 (n = s.length())
	        idx2 ranges from 0 to m-1 (m = t.length())
            Each state (idx1, idx2) is computed at most once because of memoization.
	        In each state, the recursive calls are O(1) (just two recursive calls, but memoization ensures we never recompute).
	        TC : O(N * M)

            Space Complexity:
            -----------------
            Memoization table: dp[n][m] → O(n*m)
            Recursion stack: maximum depth = n (because idx1 goes from n-1 down to 0)
            TC : O(N * M) -- DP Table + O(N) -- recursion stack = O(N * M)
        */
    }
}
