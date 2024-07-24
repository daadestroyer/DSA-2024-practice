package Arrays_06.Basic;

import java.util.Arrays;

public class App06_MoveZeroesAtEnd_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = nums.length;

        int ptr = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[ptr] = i;
                ptr++;
            }
        }
        while (ptr < nums.length) {
            nums[ptr] = 0;
            ptr++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
