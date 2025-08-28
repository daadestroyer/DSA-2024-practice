package DynamicProgramming_15.DP_On_SubSequences_03;

public class App01_SubsetSumEqualsTarget {

    public static Boolean isSubSetSum(int idx, int[] arr, int target, Boolean[][] dp) {
        if (target == 0) return true;
        if (idx == arr.length) return false;

        if (dp[idx][target] != null) return dp[idx][target];

        // pick call
        boolean pick = false;
        if (arr[idx] <= target) {
            pick = isSubSetSum(idx + 1, arr, target - arr[idx], dp);
        }
        // not pick call
        boolean notPick = isSubSetSum(idx + 1, arr, target, dp);

        dp[idx][target] = pick || notPick;

        return dp[idx][target];
    }


    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;
        Boolean[][] dp = new Boolean[arr.length][target + 1];
        System.out.println(isSubSetSum(0, arr, target, dp));
    }
}

