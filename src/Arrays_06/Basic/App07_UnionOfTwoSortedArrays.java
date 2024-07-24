package Arrays_06.Basic;

import java.util.*;


public class App07_UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int i : arr1){
            ts.add(i);
        }
        for(int i : arr2){
            ts.add(i);
        }
        ArrayList<Integer> res = ts.stream().collect(java.util.stream.Collectors.toCollection(ArrayList::new));

        return res;

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> res = findUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(res);


    }
}
