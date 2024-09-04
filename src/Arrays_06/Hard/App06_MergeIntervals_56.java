package Arrays_06.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class App06_MergeIntervals_56 {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> al = new ArrayList<>();
        // sorting internally 1d array
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] arr : intervals) {
            if (arr[0] <= end) {
                end = Math.max(end, arr[1]);
            } else {
                al.add(new int[]{start, end});
                start = arr[0];
                end = arr[1];
            }
        }
        al.add(new int[]{start, end});
        return al.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = merge(intervals);
        for (int[] a : res) {
            System.out.print(Arrays.toString(a) + " ");
        }

    }
}
