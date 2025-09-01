package DynamicProgramming_15.DP_On_SubSequences_03;

public class App02_PartitionEqualSubSetSum_416 {
    public static Boolean isSubSet(int idx, int[] nums, int target, Boolean[][] dp) {
        if (target == 0) return true;
        if (idx == nums.length) return false;
        if (dp[idx][target] != null) {
            return dp[idx][target];
        }
        boolean pick = false;
        if (nums[idx] <= target) {
            pick = isSubSet(idx + 1, nums, target - nums[idx], dp);
        }
        boolean nonPick = isSubSet(idx + 1, nums, target, dp);
        dp[idx][target] = pick || nonPick;
        return dp[idx][target];
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return isSubSet(0, nums, target, dp);
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean b = canPartition(nums);
        System.out.println(b);

    }
}
