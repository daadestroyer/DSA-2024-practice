package Arrays_06.Basic;

import java.util.Arrays;

public class App05_RotateArray {
    static void reverseArray(int[] nums, int lo, int hi) {
        while (lo <= hi) {
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k = k % nums.length;


        // reverse full array
        reverseArray(nums, 0, nums.length - 1);

        // reverse 0 to k-1
        reverseArray(nums, 0, k - 1);

        // reverse from k t0 n-1
        reverseArray(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
