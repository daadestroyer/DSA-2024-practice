package Recursion_12.Medium;

import java.util.ArrayList;

public class App05_PrintOneSubSequenceSumEqualK {
    private static boolean printOneSubSequenceSumEqualK(int[] arr, ArrayList<Integer> ds, int csum, int sum, int length, int idx) {
        if (idx == length) {
            if (csum == sum) {
                System.out.println(ds);
                return true;
            } else {
                return false;
            }
        }

        ds.add(arr[idx]);
        csum += arr[idx];
        if (printOneSubSequenceSumEqualK(arr, ds, csum, sum, length, idx + 1)) {
            return true;
        }
        // backtrack
        ds.remove(ds.size() - 1);
        csum -= arr[idx];
        if (printOneSubSequenceSumEqualK(arr, ds, csum, sum, length, idx + 1)) {
            return true;
        }
        // if both the left and right recursive call unable to give true then return false;
        return false;

    }

    private static boolean printYesIfSubSeqSeumEqualK(int[] arr, ArrayList<Integer> ds, int csum, int sum, int length, int idx) {
        if (idx == length) {
            if (csum == sum) {
                return true;
            } else {
                return false;
            }
        }
        ds.add(arr[idx]);
        csum += arr[idx];
        if(printOneSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1)){
            return true;
        }
        // backtrack
        ds.remove(ds.size()-1);
        csum -= arr[idx];
        if(printOneSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 5, 1};
        int sum = 10;
        int csum = 0;

        ArrayList<Integer> ds = new ArrayList<>();
        printOneSubSequenceSumEqualK(arr, ds, csum, sum, arr.length, 0);
        boolean b = printYesIfSubSeqSeumEqualK(arr, ds, csum, sum, arr.length, 0);
        String s = b == true ? "Yes" : "No";
        System.out.println(s);

    }


}
