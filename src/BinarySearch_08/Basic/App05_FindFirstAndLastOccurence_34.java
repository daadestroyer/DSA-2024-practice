package BinarySearch_08.Basic;

import java.sql.SQLOutput;
import java.util.Arrays;

public class App05_FindFirstAndLastOccurence_34 {
    static int[] findFirstAndLastOccurence(int[] nums, int target) {
        int n = nums.length;
        int firstOccurence = -1;
        int lastOccurence = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                firstOccurence = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == target) {
                lastOccurence = i;
                break;
            }
        }
        return new int[]{firstOccurence, lastOccurence};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = findFirstAndLastOccurence(nums, target);
        System.out.println(Arrays.toString(ans));


    }
}
