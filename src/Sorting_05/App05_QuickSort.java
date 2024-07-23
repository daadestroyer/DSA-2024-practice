package Sorting_05;

import java.util.Arrays;

public class App05_QuickSort {
    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;

        }
        int low = lo;
        int high = hi;
        int mid = (lo + hi) / 2;
        int piv = arr[mid];

        while (arr[low] < piv) {
            low++;
        }
        while (arr[high] > piv) {
            high--;
        }
        if (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        quickSort(arr, lo, high);
        quickSort(arr, low, hi);

    }

}
