package Sorting_05;

import java.util.Arrays;

public class App02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {100, 1, 2, 4, 99, 3};

        for (int i = 0; i < arr.length ; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
