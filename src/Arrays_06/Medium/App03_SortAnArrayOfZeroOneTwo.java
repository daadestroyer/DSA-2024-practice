package Arrays_06.Medium;

import java.util.Arrays;

public class App03_SortAnArrayOfZeroOneTwo {
    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i : nums) {
            if (i == 0) {
                zero++;
            } else if (i == 1) {
                one++;
            } else {
                two++;
            }
        }
        int i = 0;
        while (zero != 0) {
            nums[i] = 0;
            i++;
            zero--;
        }
        while (one != 0) {
            nums[i] = 1;
            i++;
            one--;
        }
        while (two != 0) {
            nums[i] = 2;
            i++;
            two--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
