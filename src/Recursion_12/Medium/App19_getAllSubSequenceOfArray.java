package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App19_getAllSubSequenceOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<ArrayList<Integer>> final_list = new ArrayList<>();
        getAllSubsequences(0, arr, current, final_list);
        System.out.println(final_list);
    }

    private static void getAllSubsequences(int index, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> final_list) {
        if (index == arr.length) {
            final_list.add(new ArrayList<>(current));
            return;
        }

        // pick it
        current.add(arr[index]);
        getAllSubsequences(index + 1, arr, current, final_list);

        // not pick it
        current.remove(current.size() - 1);
        getAllSubsequences(index + 1, arr, current, final_list);
    }
}
