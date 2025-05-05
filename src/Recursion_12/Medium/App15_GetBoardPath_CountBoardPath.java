package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App15_GetBoardPath_CountBoardPath {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int target = 5;
        int count = countBoardPath(0, target, res, ds);
        System.out.println("Count = " + count);
        getBoardPath(0, target, res, ds);
        System.out.println(res);
    }

    private static int countBoardPath(int sumTillNow, int target, List<List<Integer>> res, List<Integer> ds) {
        if (sumTillNow == target) {
            return 1;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            if (sumTillNow + dice <= target) {
                ds.add(dice);
                count += countBoardPath(sumTillNow + dice, target, res, ds);
                ds.remove(ds.size() - 1); // backtrack
            }
        }
        return count;
    }

    private static void getBoardPath(int sumTillNow, int target, List<List<Integer>> res, List<Integer> ds) {
        if (sumTillNow == target) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            if (sumTillNow + dice <= target) {
                ds.add(dice);
                getBoardPath(sumTillNow + dice, target, res, ds);
                ds.remove(ds.size() - 1); // backtrack
            }
        }
    }


}
