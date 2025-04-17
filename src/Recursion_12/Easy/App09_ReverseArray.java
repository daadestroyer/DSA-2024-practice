package Recursion_12.Easy;

import java.util.Arrays;

public class App09_ReverseArray {
    public static void reverseArray(int[] arr,int lo , int hi){
        if(lo > hi){
            return;
        }
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        reverseArray(arr,lo+1,hi-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArray(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
