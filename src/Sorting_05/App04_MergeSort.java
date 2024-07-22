package Sorting_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class App04_MergeSort {
    static int[] mergeArray( int[] fh, int[] sh) {
        int[] res = new int[fh.length + sh.length];

        int i = 0; // points to first half array 0th index
        int j = 0; // points to second half array 0th index
        int k = 0; // points to result array 0th index

        while (i < fh.length && j < sh.length) {
            if (fh[i] < sh[j]) {
                res[k] = fh[i];
                i++;
                k++;
            } else {
                res[k] = sh[j];
                k++;
                j++;
            }
        }
        while (i < fh.length) {
            res[k++] = fh[i++];
        }

        while (j < sh.length) {
            res[k++] = sh[j++];
        }
        return res;
    }

    static int[] mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            int[] bc = new int[1];
            bc[0] = arr[low];
            return bc;
        }

        int mid = (low + high) / 2;
        int[] fh = mergeSort(arr, low, mid);
        int[] sh = mergeSort(arr, mid + 1, high);
        return mergeArray(fh, sh);
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 9, 1, 2, 5};
        int[] res = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(res));
    }
}
