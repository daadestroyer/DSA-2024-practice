package Arrays_06.Basic;

import java.util.ArrayList;
import java.util.List;

public class App02_SecondLargestElementInArrayWithoutSorting {
    private static int findSecondLargestElement(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (Integer i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;

            } else if (i < firstLargest && i > secondLargest) {
                secondLargest = i;
            }
        }

        return secondLargest == 0 ? -1 : secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargestElement(arr));


    }
}
