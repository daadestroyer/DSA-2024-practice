package Arrays_06.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class App18_SquareOfASortedArray_977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[pos] = nums[left] * nums[left];
                pos--;
                left++;
            } else {
                res[pos] = nums[right] * nums[right];
                pos--;
                right--;
            }
        }
        System.out.println(Arrays.toString(res));

    }
}
