package SlidingWindow_TwoPointer_11;

import java.util.HashMap;

public class App02_MaxConsecutiveOnes_1004 {
    public static void main(String[] args) {
        // TC: O(N) SC: O(N)
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int maxZero = 0;
        int len = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                maxZero++;
            }
            while (maxZero > k) {
                if (nums[left] == 0) { // as we are shrinking window from left to right
                    maxZero--;         // we need to maintain max zero also
                }
                left++;
            }
            len = Math.max(len, right - left + 1);
        }
        System.out.println(len);

    }
}
