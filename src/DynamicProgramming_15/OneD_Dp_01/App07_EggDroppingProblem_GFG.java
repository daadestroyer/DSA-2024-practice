package DynamicProgramming_15.OneD_Dp_01;

import java.util.Arrays;

public class App07_EggDroppingProblem_GFG {
    public static int findEggDrop(int n, int k, int[][] dp) {
        // no floor left
        if(k == 0 || k == 1){
            return k;
        }
        if(n == 1) return k;

        if(dp[n][k] != -1) return dp[n][k];

        int res = Integer.MAX_VALUE;
        for(int i=1 ; i<= k ; i++){
            int breakCase = findEggDrop(n-1,i-1,dp);
            int surviveCase = findEggDrop(n,k-i,dp);

            int curr = Math.max(breakCase,surviveCase);
            if(curr < res)
                res = curr;
        }
        dp[n][k] = res+1;
        return dp[n][k];
    }

    public static void main(String[] args) {
        int n = 2, k = 36;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findEggDrop(n, k, dp));
    }
}
