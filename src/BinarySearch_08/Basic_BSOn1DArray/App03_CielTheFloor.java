package BinarySearch_08.Basic_BSOn1DArray;

import java.util.Arrays;

public class App03_CielTheFloor {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};

        // [5, 5, 5, 6, 6, 6, 8, 9]
        int x = 7;
        int ciel = -1;
        int floor = -1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                ciel = arr[i];
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= x){
                floor = arr[i];
            }
        }
        System.out.println(ciel+" "+floor);
    }
}
