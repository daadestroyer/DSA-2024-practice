package DynamicProgramming_15.DP_On_Strings;

import java.util.Arrays;

public class App02_PrintLongestCommonSubSequence_GFG {
    public static int getLongestSubSeq(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;
        }
        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }
        int res;
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + getLongestSubSeq(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            res = Math.max(getLongestSubSeq(idx1 - 1, idx2, s1, s2, dp), getLongestSubSeq(idx1, idx2 - 1, s1, s2, dp));
        }
        dp[idx1][idx2] = res;
        return res;
    }

    public static String buildLCS(String s1, String s2, int[][] dp) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                sb.append(s1.charAt(i));
                i--;
                j--;
            } else {
                int up = 0;
                if (i - 1 >= 0) {
                    if (dp[i - 1][j] == -1) {
                        getLongestSubSeq(i - 1, j, s1, s2, dp);
                    }
                    up = dp[i - 1][j];
                }
                int left = 0;
                if (j - 1 >= 0) {
                    if (dp[i][j - 1] == -1) {
                        getLongestSubSeq(i, j - 1, s1, s2, dp);
                    }
                    left = dp[i][j - 1];
                }
                if (up >= left) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String text1 = "brute";
        String text2 = "groot";
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int len = getLongestSubSeq(n - 1, m - 1, text1, text2, dp);
        System.out.println("Len = " + len);
        String str = buildLCS(text1, text2, dp);
        System.out.println("Str = " + str);

        for(int[] arr : dp){
            System.out.println(Arrays.toString(arr));
        }
        /*
            Time Complexity: O(m * n)
            Space Complexity: O(m * n)
        */
    }
}
