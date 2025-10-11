package DynamicProgramming_15.DP_On_Strings_04;

import java.util.Arrays;

public class App07_MinimumInsertionStepsToMakeAStringPalindrome_1312 {
    public static int findLen(int low, int high, String s, int[][] dp) {
        if (low > high) return 0;
        if (low == high) return 1;

        if (dp[low][high] != -1) return dp[low][high];
        int res = 0;

        if (s.charAt(low) == s.charAt(high)) {
            res = 2 + findLen(low + 1, high-1, s, dp);
        } else {
            res = 0 + Math.max(findLen(low + 1, high, s, dp), findLen(low, high - 1, s, dp));
        }
        dp[low][high] = res;
        return res;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int lengthOfLongestPalindromicSubSeq = findLen(0, n - 1, s, dp);
        int minimumInsertions = n - lengthOfLongestPalindromicSubSeq;
        System.out.println(minimumInsertions);
    }
}
