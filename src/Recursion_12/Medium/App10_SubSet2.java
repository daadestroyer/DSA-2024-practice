package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, which can have duplicate entries, provide the power set.
Duplicate subsets cannot exist in the solution set.
Return the answer in any sequence.



 */
public class App10_SubSet2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        findSubSetTwo(res, ds, nums, 0);
        System.out.println(res);
    }

    private static void findSubSetTwo(List<List<Integer>> res, ArrayList<Integer> ds, int[] nums, int idx) {
        res.add(new ArrayList<>(ds));
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i - 1] == nums[i]) continue;
            ds.add(nums[i]);
            findSubSetTwo(res, ds, nums, i + 1);
            ds.remove(ds.size() - 1);
        }
    }
}
