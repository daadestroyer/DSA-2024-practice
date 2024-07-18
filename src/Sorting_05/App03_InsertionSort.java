package Sorting_05;

import java.util.Arrays;

public class App03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 4, 11, 23};

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
