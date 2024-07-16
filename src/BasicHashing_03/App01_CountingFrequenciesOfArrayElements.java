package BasicHashing_03;

import java.util.Arrays;
import java.util.HashMap;

public class App01_CountingFrequenciesOfArrayElements {
    public static void bruteForce(int arr[], int N, int P, HashMap<Integer,Integer> hm){
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i=1 ; i<=N ; i++){
            if(hm.containsKey(i)){
                arr[i-1]=hm.get(i);
            }else{
                arr[i-1]=0;
            }
        }
    }
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        bruteForce(arr,N,P,hm);
    }


}
