package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App08_SplitArrayLargestSum {
    public static boolean check(int mid, int[] nums, int k) {
        int subArrays = 1;
        int sum = 0;

        for (int i : nums) {
            sum += i;
            if (sum > mid) {
                subArrays++;
                sum = i;
            }
        }
        return subArrays <= k;
    }

    public static int applyBinarySearch(int[] nums, int k) {
        int min = Arrays.stream(nums).max().getAsInt();
        int max = Arrays.stream(nums).sum();

        while (min <= max) {
            int mid = (min + max) / 2;
            if (check(mid, nums, k)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(applyBinarySearch(nums, k));
    }
}
