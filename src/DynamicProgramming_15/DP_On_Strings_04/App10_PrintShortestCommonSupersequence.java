package DynamicProgramming_15.DP_On_Strings_04;

import java.util.Arrays;

public class App10_PrintShortestCommonSupersequence {
    public static int findLengthOfLongestCommonSubSequence(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) return 0;
        if (dp[idx1][idx2] != -1) return dp[idx1][idx2];

        int res = 0;
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + findLengthOfLongestCommonSubSequence(idx1 - 1, idx2 - 1, s1, s2, dp);
        } else {
            res = Math.max(findLengthOfLongestCommonSubSequence(idx1 - 1, idx2, s1, s2, dp), findLengthOfLongestCommonSubSequence(idx1, idx2 - 1, s1, s2, dp));
        }
        dp[idx1][idx2] = res;
        return res;
    }

    public static String buildShortestCommonSupersequence(String s1, String s2, int[][] dp) {
        StringBuilder sb = new StringBuilder();
        int idx1 = s1.length() - 1;
        int idx2 = s2.length() - 1;
        while (idx1 >= 0 && idx2 >= 0) {
            if (s1.charAt(idx1) == s2.charAt(idx2)) {
                sb.append(s1.charAt(idx1));
                idx1--;
                idx2--;
            } else {
                int left = (idx2 - 1 >= 0) ? dp[idx1][idx2 - 1] : 0;
                int up = (idx1 - 1 >= 0) ? dp[idx1 - 1][idx2] : 0;

                if (left >= up) {
                    sb.append(s2.charAt(idx2));
                    idx2--;
                } else {
                    sb.append(s1.charAt(idx1));
                    idx1--;
                }
            }
        }
        while(idx1 >=0){
            sb.append(s1.charAt(idx1));
            idx1--;
        }
        while(idx2 >= 0){
            sb.append(s2.charAt(idx2));
            idx2--;
        }
        return sb.reverse().toString();
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
        findLengthOfLongestCommonSubSequence(n - 1, m - 1, s1, s2, dp);
        String str = buildShortestCommonSupersequence(s1, s2, dp);
        System.out.println(str);
        /*
            Time Complexity : O(n * m)
            Space Complexity : O(n * m)
        */
    }
}
