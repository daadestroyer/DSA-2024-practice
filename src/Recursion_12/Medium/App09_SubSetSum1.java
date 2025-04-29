package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Given an array nums of n integers. Return sum of all subsets of the array nums.
Output can be printed in any order.


_ _ _ _ _ at each index we have two choices either to pick or not pick. So for n size array we have 2^n options
TC : is 2^n
SC : 2^n(logn)
 */
public class App09_SubSetSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 3};
        ArrayList<Integer> ds = new ArrayList<>();
        findSubSet(nums, ds, 0, 0);
        Collections.sort(ds);
        System.out.println(ds);
    }

    private static void findSubSet(int[] nums, ArrayList<Integer> ds, int sum, int idx) {
        if (idx == nums.length) {
            ds.add(sum);
            return;
        }

        // pick the element
        findSubSet(nums, ds, sum + nums[idx], idx + 1);
        // not pick the element
        findSubSet(nums, ds, sum, idx + 1);
    }
}
