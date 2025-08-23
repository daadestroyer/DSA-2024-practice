package DynamicProgramming_15;

import java.util.ArrayList;
import java.util.Arrays;

public class App06_HouseRobber_213 {
    public static int houseRobber(int index, int[] arr, int[] dp) {
        if (index == 0) {
            return arr[0];
        }
        if (index < 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        // pick
        int pick = arr[index] + houseRobber(index - 2, arr, dp);

        // not pick
        int notPick = houseRobber(index - 1, arr, dp);

        int max = Math.max(pick, notPick);
        dp[index] = max;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};


        int[] copyArray1 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] copyArray2 = Arrays.copyOfRange(nums, 0, nums.length - 1);

        int[] dp1 = new int[copyArray1.length];
        Arrays.fill(dp1, -1);

        int[] dp2 = new int[copyArray2.length];
        Arrays.fill(dp2, -1);

        int res1 = houseRobber(copyArray1.length - 1, copyArray1, dp1);
        int res2 = houseRobber(copyArray2.length - 1, copyArray2, dp2);
        int finalRes = Math.max(res1, res2);
        System.out.println(finalRes);

        /*
        Time Complexity :
        ------------------
        •	You are using memoization (dp array + recursion).
        •	Each index in arr is solved once, and after that, the result is reused from dp.
        •	For each of the two arrays (copyArray1 and copyArray2), solving takes O(n).
        •	So overall:
            Time Complexity = O(n)

        Space Complexity :
        -------------------
        1.	DP array → size n-1 for each case → O(n).
	    2.	Recursion stack → in the worst case, recursion goes down n levels → O(n).

        So total:
        Space Complexity = O(n) + O(n) = O(n)
        */

    }
}
