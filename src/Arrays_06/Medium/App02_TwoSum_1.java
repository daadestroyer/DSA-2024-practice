package Arrays_06.Medium;

import java.util.*;

public class App02_TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = findTwoSum(nums, target, nums.length);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findTwoSum(int[] nums, int target, int n) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                // return indices (0-based)
                return new int[]{left, right};
            } else if (sum < target) {
                left++;  // move rightward to increase sum
            } else {
                right--; // move leftward to decrease sum
            }
        }

        // no pair found
        return new int[]{-1, -1};
    }
}
