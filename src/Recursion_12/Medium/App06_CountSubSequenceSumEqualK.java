package Recursion_12.Medium;

import java.util.ArrayList;

public class App06_CountSubSequenceSumEqualK {

    private static int countSubSequenceSumEqualK(int[] arr, ArrayList<Integer> ds, int csum, int sum, int length, int idx) {
        if(idx == arr.length){
           if(csum == sum){
               return 1;
           }
           else{
               return 0;
           }
        }

        ds.add(arr[idx]);
        csum += arr[idx];
        int leftRes = countSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1);
        csum -= arr[idx];
        ds.remove(ds.size()-1);
        int rightRes = countSubSequenceSumEqualK(arr,ds,csum,sum,length,idx+1);
        return leftRes + rightRes;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;
        int csum = 0;

        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println(countSubSequenceSumEqualK(arr, ds, csum, sum, arr.length, 0));
    }

}
