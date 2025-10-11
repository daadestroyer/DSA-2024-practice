package DynamicProgramming_15.DP_On_Strings_04;

import java.util.Arrays;

public class App09_LengthOfShortestCommonSupersequence_1092 {
    public static int findLenOfLongestCommonSubSequence(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) return 0;

        if (dp[idx1][idx2] != -1) return dp[idx1][idx2];

        int res = 0;
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + findLenOfLongestCommonSubSequence(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            res = Math.max(findLenOfLongestCommonSubSequence(idx1 - 1, idx2, s1, s2, dp), findLenOfLongestCommonSubSequence(idx1, idx2 - 1, s1, s2, dp));
        }
        dp[idx1][idx2] = res;
        return res;
    }

    public static void main(String[] args) {
        String s1 = "brute";
        String s2 = "groot";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int lenOfLongestCommonSubSequence = findLenOfLongestCommonSubSequence(n - 1, m - 1, s1, s2, dp);
        int lengthOfShortestCommonSuperSequence = n + m - lenOfLongestCommonSubSequence;
        System.out.println(lengthOfShortestCommonSuperSequence);
    }

    /*
        Time Complexity : O(n * m)
        Space Complexity : O(n * m)
    */
}
