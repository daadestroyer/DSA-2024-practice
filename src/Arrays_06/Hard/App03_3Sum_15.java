package Arrays_06.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App03_3Sum_15 {
    static List<List<Integer>> bruteForceApproach(int[] nums, int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int lo = 0; lo < n - 2; lo++) {
            for (int mid = lo + 1; mid < n - 1; mid++) {
                for (int hi = mid + 1; hi < n; hi++) {
                    if (nums[lo] + nums[mid] + nums[hi] == 0) {
                        List<Integer> al = Arrays.asList(nums[lo], nums[mid], nums[hi]);

                        Collections.sort(al);
                        if (!res.contains(al)) {
                            res.add(al);
                        }
                    }
                }
            }
        }
        return res;
    }

    static List<List<Integer>> optimalApproach(int[] nums, int n) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int lo = 0; lo < n - 2; lo++) {
            if (lo == 0 || nums[lo] != nums[lo - 1]) {
                int mid = lo + 1;
                int hi = n - 1;
                int target = 0 - nums[lo];
                while (mid < hi) {
                    if (nums[mid] + nums[hi] == target) {
                        List<Integer> curr_res = Arrays.asList(nums[lo], nums[mid], nums[hi]);
                        res.add(curr_res);
                        while (mid < hi && nums[mid] == nums[mid + 1]) {
                            mid++;
                        }
                        while (mid < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        mid++;
                        hi--;
                    } else if (nums[mid] + nums[hi] > target) {
                        hi--;
                    } else {
                        mid++;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = bruteForceApproach(nums, nums.length);
        //List<List<Integer>> res = optimalApproach(nums, nums.length);

        System.out.println(res);
    }
}
