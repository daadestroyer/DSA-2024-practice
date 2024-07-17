package BasicRecursion_02;

import java.util.Arrays;
import java.util.stream.Stream;

public class App03_ReverseAnArray {


    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = n - 1;
        reverseArray(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr,left+1,right-1);
    }
}
