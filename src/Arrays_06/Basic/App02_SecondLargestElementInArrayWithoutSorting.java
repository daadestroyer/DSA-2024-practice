package Arrays_06.Basic;

import java.util.ArrayList;
import java.util.List;

public class App02_SecondLargestElementInArrayWithoutSorting {
    public static void main(String[] args) {
        List<Integer> arr = List.of(12, 35 ,1 ,10, 34, 1);
        int secondLargestElement = findSecondLargestElement(arr);
        System.out.println(secondLargestElement);

    }

    private static int findSecondLargestElement(List<Integer> arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (Integer i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;

            }
            else if(i < firstLargest && i > secondLargest){
                secondLargest = i;
            }
        }

        return secondLargest == 0 ? -1 : secondLargest;
    }
}
