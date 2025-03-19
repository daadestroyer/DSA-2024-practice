package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App09_PaintersPartitionProblem_CN {
    public static boolean canDoneInThisTime(int givenTime, List<Integer> list, int painters) {
        int paintersReqTillNow = 1;
        int boardsAlloted = 0;
        for (int boards : list) {
            if (boardsAlloted + boards <= givenTime) {
                boardsAlloted += boards; // keep on adding boards to same painter until her
            } else {
                // if painter 1 goes out of limit , then keep assign to next painter
                paintersReqTillNow++;
                boardsAlloted = boards;
            }
        }
        return paintersReqTillNow <= painters;
    }

    public static int findPaintersTime(List<Integer> list, int painters) {
        int low = Collections.max(list);
        int hi = list.stream().mapToInt(i -> i).sum();
        while (low <= hi) {
            int givenTime = (low + hi) / 2;
            if (canDoneInThisTime(givenTime, list, painters)) {
                hi = givenTime - 1;
            } else {
                low = givenTime + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 1, 5, 6, 2, 3);
        int painters = 2;
        System.out.println(findPaintersTime(arr, painters));


    }
}
