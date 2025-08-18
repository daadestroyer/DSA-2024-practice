package Recursion_12.Medium;

import java.util.ArrayList;

public class App18_printAllSubSequenceOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> res = new ArrayList<>();
        printSubsequences(0, new ArrayList<>(), arr);
    }

    private static void printSubsequences(int index, ArrayList<Integer> res, int[] arr) {

        if (index == arr.length) {
            System.out.print(res);
            return;
        }
        // pick the elements
        res.add(arr[index]);
        printSubsequences(index + 1, res, arr);

        // not pick the elements
        res.remove(res.size() - 1);
        printSubsequences(index + 1, res, arr);
    }
}
