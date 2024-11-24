package BinarySearch_08.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App06_PaintersPartitionProblem_CN {

    public static int countPainters(List<Integer> arr, int time) {
        int n = arr.size();
        int paintersAllocated = 1;
        int boardsPainted = 0;
        for (int i = 0; i < n; i++) {
            if (boardsPainted + arr.get(i) <= time) {
                boardsPainted += arr.get(i);
            } else {
                paintersAllocated++;
                boardsPainted = arr.get(i);
            }
        }
        return paintersAllocated;
    }

    public static int bruteForceApproach(List<Integer> arr, int painters) {
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(i -> i).sum();

        for (int time = low; time <= high; time++) {
            if (countPainters(arr, time) == painters) {
                return time;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 30, 40);
        int painters = 2;
        System.out.println(bruteForceApproach(arr, painters));

    }
}
