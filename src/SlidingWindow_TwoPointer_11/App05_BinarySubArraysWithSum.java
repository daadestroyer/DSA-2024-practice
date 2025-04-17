package SlidingWindow_TwoPointer_11;

import java.util.HashMap;

public class App05_BinarySubArraysWithSum {

    public static int bruteForce(int[] nums, int goal) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                } else if (sum > goal) {
                    break;
                }
            }
        }
        return count;
    }

    public static int optimalApproach(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i : nums) {
            sum += i;
            if(hm.containsKey(sum-goal)){
                count += hm.get(sum-goal);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        // System.out.println(bruteForce(nums, goal));
        System.out.println(optimalApproach(nums,goal));
    }
}
