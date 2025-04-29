package Recursion_12.Medium;

import java.util.ArrayList;

public class App04_PrintAllSubSequenceSumEqualK {

    private static void printSubSequenceSumEqualK(int[] arr, ArrayList<Integer> ds, int csum, int sum, int length, int idx) {
        if(idx == length){
            if(csum == sum){
                System.out.println(ds);

            }
            return;
        }
        ds.add(arr[idx]);
        csum += arr[idx];
        printSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1);
        // backtrack
        ds.remove(ds.size()-1);
        csum -= arr[idx];
        printSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 2,5,1};
        int sum = 10;
        int csum = 0;

        ArrayList<Integer> ds = new ArrayList<>();
        printSubSequenceSumEqualK(arr,ds,csum,sum,arr.length,0);

    }
}
