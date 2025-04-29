package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App03_ReturnAllSubSetOfNumber {

    public static void generateSubSet(int[] nums, List<List<Integer>> res, List<Integer> ds, int idx) {
        if(idx == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        generateSubSet(nums,res,ds,idx+1);
        ds.remove(ds.size()-1);
        generateSubSet(nums,res,ds,idx+1);
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        generateSubSet(nums, list, ds, 0);
        System.out.println(list);
    }
}
