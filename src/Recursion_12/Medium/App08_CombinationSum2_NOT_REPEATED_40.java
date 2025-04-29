package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App08_CombinationSum2_NOT_REPEATED_40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates, target, res, ds, 0);
        System.out.println(res);
    }

    private static void findCombination(int[] candidates, int target, List<List<Integer>> res, ArrayList<Integer> ds, int idx) {
        if (target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i - 1] == candidates[i]) continue;
            if(target >= candidates[i]){
                ds.add(candidates[i]);
                findCombination(candidates,target-candidates[i],res,ds,i+1);
                ds.remove(ds.size()-1);
            }
        }
    }


}
