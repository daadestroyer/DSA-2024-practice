package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App07_CombinationSum1_REPEATED_39 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        findCombinationSum(arr, target, res, ds, 0);
        System.out.println(res);
    }

    private static void findCombinationSum(int[] arr, int target, List<List<Integer>> res, ArrayList<Integer> ds, int idx) {
        if (idx == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        // CASE 1 - PICKING
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombinationSum(arr, target - arr[idx], res, ds, idx); // keeping idx same, as multiple time picking is allowed
            // backtrack
            ds.remove(ds.size() - 1);
        }
        // CASE 2 - NON PICKING
        findCombinationSum(arr, target, res, ds, idx + 1); // incrementing idx as a part of NON - PICKING
    }
}
