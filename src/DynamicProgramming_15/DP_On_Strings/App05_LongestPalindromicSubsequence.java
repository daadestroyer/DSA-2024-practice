package DynamicProgramming_15.DP_On_Strings;

import java.util.Arrays;

public class App05_LongestPalindromicSubsequence {
    public static int lengthOfLongestPalindromic(int low, int high, String s, int[][] dp) {
        if (low > high) return 0; // no palindrome
        if (low == high) return 1; // single char

        if (dp[low][high] != -1)
            return dp[low][high];

        int res = 0;
        if (s.charAt(low) == s.charAt(high)) {
            res = 2 + lengthOfLongestPalindromic(low + 1, high - 1, s, dp);
        } else {
            res = 0 + Math.max(lengthOfLongestPalindromic(low + 1, high, s, dp), lengthOfLongestPalindromic(low, high - 1, s, dp));
        }
        dp[low][high] = res;
        return res;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);
        System.out.println(lengthOfLongestPalindromic(0, n - 1, s, dp));

        /*
            Time Complexity: O(n²)
            Space Complexity: O(n²)
        */
    }
}
