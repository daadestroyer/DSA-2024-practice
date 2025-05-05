package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App13_PermutationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cres = new ArrayList<>();
        boolean[] visisted = new boolean[arr.length];
        findPermutationArray(res, cres, visisted, arr);
        System.out.println(res);
    }

    private static void findPermutationArray(List<List<Integer>> res, List<Integer> cres, boolean[] visisted, int[] arr) {
        if (cres.size() == arr.length) {
            if (isNotDuplicate(res, cres)) {
                res.add(new ArrayList<>(cres));
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            // before picking element check that we shouldn't have pick this element previously
            if (!visisted[i]) {
                visisted[i] = true;
                cres.add(arr[i]);
                findPermutationArray(res, cres, visisted, arr);
                visisted[i] = false;
                cres.remove(cres.size() - 1);
            }
        }
    }

    private static boolean isNotDuplicate(List<List<Integer>> res, List<Integer> cres) {
        for(List<Integer> r : res){
            if(r.equals(cres)){
                return false;
            }
        }
        return true;
    }
}
