package Sorting_05;

import java.util.Arrays;

public class App06_MergeSort_INPLACE {
    static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[low + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low; // <-- k must start at low
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    static void doMergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2; // safer than (left+right)/2
        doMergeSort(arr, left, mid);
        doMergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void mergeSort(int arr[], int l, int r) {
        if (arr == null || arr.length == 0) return;
        if (l < 0) l = 0;
        if (r > arr.length - 1) r = arr.length - 1; // slightly clearer check
        doMergeSort(arr, l, r);
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        mergeSort(arr, 0, 11);
        System.out.println(Arrays.toString(arr));
    }
}
