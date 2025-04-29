package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.

Return a list of all possible valid combinations.
The list must not contain the same combination twice, and the combinations may be returned in any order.
 */
public class App11_Combination3 {
    public static void main(String[] args) {
        int k = 3, n = 7;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinationThree(k, n, res, ds, 1);
        System.out.println(res);
    }

    private static void findCombinationThree(int k, int n, List<List<Integer>> res, List<Integer> ds, int start) {
        if (ds.size() == k && n == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = start; i <= 9; i++) {
            ds.add(i);
            findCombinationThree(k, n-i, res, ds, i + 1);
            ds.remove(ds.size() - 1);
        }
    }
}
