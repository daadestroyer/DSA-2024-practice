package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App04_CapacityToShipPackagesWithinDDays {


    public static boolean isItPossible(int tryWithThisCapacity,int[] weights,int days){
        int daysReqTillNow = 1;
        int capTillNow = 0;
        for(int currWt : weights){
            if(capTillNow + currWt <= tryWithThisCapacity){
                capTillNow += currWt;
            }
            else{
                daysReqTillNow++;
                capTillNow = currWt;
            }
        }
        return daysReqTillNow <= days;

    }
    public static int findSolution(int[] weights, int days){
        int len = weights.length;
        // taking minCap as max of all cap
        int minCapacity = Arrays.stream(weights).max().getAsInt();
        // taking maxCap as sum of all cap
        int maxCapacity = Arrays.stream(weights).sum();
        while(minCapacity <= maxCapacity){
            int tryWithThisCapacity = (minCapacity + maxCapacity)/2;
            if(isItPossible(tryWithThisCapacity,weights,days)){
                maxCapacity = tryWithThisCapacity - 1;
            }
            else{
                minCapacity = tryWithThisCapacity + 1;
            }
        }
        return minCapacity;
    }
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        // System.out.println(bruteForceApproach(weights, days));
        System.out.println(findSolution(weights, days));

    }
}
