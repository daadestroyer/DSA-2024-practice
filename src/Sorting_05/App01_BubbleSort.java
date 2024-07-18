package Sorting_05;

import java.util.Arrays;

public class App01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 10, 1, 2, 5, 4, 400};

        for (int iteration = 0; iteration < arr.length; iteration++) {
            for (int comparison = 0; comparison < arr.length - 1; comparison++) {
                if (arr[comparison] > arr[comparison + 1]) {
                    int temp = arr[comparison];
                    arr[comparison] = arr[comparison + 1];
                    arr[comparison + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
