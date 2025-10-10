package DynamicProgramming_15.DP_On_Strings;

import java.util.Arrays;

public class App08_MinimumDeletionOperationToMakeTwoStringSame_583 {
    public static int lenOfCommonSubSequence;

    public static int findLen(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;
        }
        if (dp[idx1][idx1] != -1) {
            return dp[idx1][idx2];
        }
        int res = 0;
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + findLen(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            res = 0 + Math.max(findLen(idx1 - 1, idx2, s1, s2, dp), findLen(idx1, idx2 - 1, s1, s2, dp));
        }
        dp[idx1][idx2] = res;
        return res;
    }

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        lenOfCommonSubSequence = findLen(n - 1, m - 1, word1, word2, dp); // 2
        int deletionOP1 = n - lenOfCommonSubSequence; // 1
        int deletionOP2 = m - lenOfCommonSubSequence; // 1
        System.out.println(deletionOP1+deletionOP2);
    }
}
