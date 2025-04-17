package Arrays_06.Medium;

import java.util.HashMap;

public class App13_CountSubArraysWithGivenSum {
    static boolean sum(int[] nums, int i, int j, int k) {
        int sum = 0;
        for (int ptr = i; ptr <= j; ptr++) {
            sum += nums[ptr];
        }
        return sum == k ? true : false;
    }

    private static int bruteForceApproach(int[] nums, int length, int k) {
        int res = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (sum(nums, i, j, k)) {
                    res++;
                }
            }
        }
        return res;
    }

    static int optimalApproach(int[] nums, int n, int k) {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for (int i : nums) {
            sum += i;
            System.out.println("sum = "+sum  +", = "+"k = "+k);
            res += hm.getOrDefault(sum-k, 0);
            System.out.println("res = "+res);
            hm.put(i, hm.getOrDefault(sum, 0) + 1);
        }
        System.out.println(hm);
        return res;
    }

    public static void main(String[] args) {
        // int[] nums = {3, 1, 2, 4}-b b
        // k =6
        int[] nums = {1, 1, 1};
        int k = 2;
        // System.out.println(bruteForceApproach(nums, nums.length, k));
        System.out.println(optimalApproach(nums, nums.length, k));
    }

}
