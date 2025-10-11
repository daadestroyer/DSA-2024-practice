package DynamicProgramming_15.DP_On_Strings_04;

import java.util.Arrays;

public class App01_LongestCommonSubsequence_1143 {
    public static int getLongestSubSeq(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;
        }
        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }
        int res = 0;
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + getLongestSubSeq(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            res = 0 + Math.max(getLongestSubSeq(idx1 - 1, idx2, s1, s2, dp), getLongestSubSeq(idx1, idx2 - 1, s1, s2, dp));
        }
        dp[idx1][idx2] = res;
        return dp[idx1][idx2];
    }



    public static void main(String [] args) {
        String text1 = "brute";
        String text2 = "groot";
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(getLongestSubSeq(text1.length() - 1, text2.length() - 1, text1, text2, dp));

        /*
            Time Complexity: O(m * n)
            Space Complexity: O(m * n)
        */

    }
}
