package Arrays_06.Medium;

import java.util.Arrays;
import java.util.Collections;

public class App08_NextPermutation_31 {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    static void reverse(int[] arr , int idx1,int idx2){
        while(idx1 < idx2){
            swap(arr,idx1++,idx2--);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1,n-1);

        System.out.println(Arrays.toString(nums));
    }
}
