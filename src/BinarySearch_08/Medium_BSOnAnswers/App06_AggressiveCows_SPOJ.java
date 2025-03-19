package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App06_AggressiveCows_SPOJ {
    public static boolean canWePlace(int tryWithThisDist, int[] stalls, int noOfCows) {
        int cowsPlacedTillNow = 1; // by default place cow 1
        int lastDist = stalls[0];  // at 1st stall

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastDist >= tryWithThisDist) {
                cowsPlacedTillNow++;
                lastDist = stalls[i];
            }
            if (cowsPlacedTillNow >= noOfCows) {
                return true;
            }
        }
        return false;

    }

    public static int aggressiveCowsOptimal(int[] stalls, int noOfCows) {
        Arrays.sort(stalls);
        int minDist = 1;
        int maxDist = stalls[stalls.length - 1] - stalls[0];
        while (minDist <= maxDist) {
            int tryWithThisDist = (minDist + maxDist) / 2;
            if (canWePlace(tryWithThisDist, stalls, noOfCows)) {
                minDist = tryWithThisDist + 1;

            } else {
                maxDist = tryWithThisDist - 1;
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        // NOTE :  What is the largest minimum distance?
        // means we need to maximize our answer
        int[] stallsPosition = {1, 2, 8, 4, 9};
        int noOfCows = 3;
        System.out.println(aggressiveCowsOptimal(stallsPosition, noOfCows));
    }
}
