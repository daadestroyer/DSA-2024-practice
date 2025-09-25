package DynamicProgramming_15.DP_On_Strings;

import java.util.Arrays;

public class App03_LongestCommonSubstring_GFG {
    static int maxLen;

    public static int lcsSubString(int idx1, int idx2, String s1, String s2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;
        }
        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }
        int res = 0;
        // we are checking diagonals means
        // s1 = "abcdae" , s2="abcde" , i = s1.length-1 and j = s2.length-1
        // if we keep doing fun(i--,j--) we will be checking only diagonals
        // if matches
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            res = 1 + lcsSubString(idx1 - 1, idx2 - 1, s1, s2, dp);
            if (res > maxLen) {
                maxLen = res;
            }
        }
        // if not matches
        else {
            res = 0;
        }

        lcsSubString(idx1 - 1, idx2, s1, s2, dp);

        lcsSubString(idx1, idx2 - 1, s1, s2, dp);
        dp[idx1][idx2] = res;
        return res;

    }

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "ACDGHR";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        maxLen = 0;
        lcsSubString(n - 1, m - 1, s1, s2, dp);
        System.out.println(maxLen);

        /*
            Time Complexity: O(n * m)
	        Space Complexity: O(n * m)
        */
    }
}
