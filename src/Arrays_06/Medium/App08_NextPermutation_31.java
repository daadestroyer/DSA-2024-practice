package Arrays_06.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App08_NextPermutation_31 {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void reverse(int[] arr, int idx1, int idx2) {
        while (idx1 < idx2) {
            swap(arr, idx1++, idx2--);
        }
    }

    public static void nextPermutationOptimal(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        System.out.println(Arrays.toString(nums));
        reverse(nums, i + 1, n - 1);
    }

    static void findNextPermutation(List<List<Integer>> res, int[] target) {

        for (int i = 0; i < res.size()-1 - 1; i++) {
            if (Arrays.equals(res.get(i).stream().mapToInt(Integer::intValue).toArray(), target)) {
                System.out.println(res.get(i + 1));
                return;
            }
        }
    }

    public static void bruteForceApproach(int[] nums, int index, List<List<Integer>> res) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i : nums) {
                ds.add(i);
            }
            res.add(ds);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            bruteForceApproach(nums, index + 1, res);
            swap(nums, i, index);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
//        List<List<Integer>> res = new ArrayList<>();
//        bruteForceApproach(nums, 0, res);
//        res.sort((a, b) -> {
//            for (int i = 0; i < a.size(); i++) {
//                if (a.get(i) > b.get(i)) {
//                    return b.get(i) - a.get(i);
//                } else {
//                    return a.get(i) - b.get(i);
//                }
//            }
//            return 0;
//        });
//        System.out.println(res);
//        findNextPermutation(res, nums);

         nextPermutationOptimal(nums);

         System.out.println(Arrays.toString(nums));
    }
}
