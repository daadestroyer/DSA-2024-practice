package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App03_FindTheSmallestDivisorGivenAThreshold {
    public static boolean isItPossible(int mid, int[] nums, int threshold) {
        int divisorsResult = 0;
        for (int i : nums) {
            // (7 + 3 -1)/3
            divisorsResult += Math.ceil((double)i/(double)mid);
        }
        return divisorsResult <= threshold;
    }

    public static int findSmallestDivisor(int[] nums, int threshold) {
        int len = nums.length;
        int low = 1;
        int hi = Arrays.stream(nums).max().getAsInt();
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (isItPossible(mid, nums, threshold)) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {21212,10101,12121};
        int threshold = 1000000;
        System.out.println(findSmallestDivisor(nums, threshold));
    }
}
