package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App04_AggressiveCows_SPOJ {
    private static boolean canWePlace(int minDist, int[] stalls, int noOfCows) {
        int noOfCowsPlaced = 1;
        int lastStallAtCowPlaced = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastStallAtCowPlaced >= minDist) {
                noOfCowsPlaced++;
                lastStallAtCowPlaced = stalls[i];
            }
            if (noOfCowsPlaced >= noOfCows) {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCowsBruteForce(int[] stalls, int noOfCows) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int maxDist = stalls[stalls.length - 1] - stalls[0];
        for (int minDist = 1; minDist <= maxDist; minDist++) {
            if (canWePlace(minDist, stalls, noOfCows) == false) {
                return minDist - 1;
            }
        }
        return maxDist;
    }

    public static int aggressiveCowsOptimal(int[] stalls, int noOfCow) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(mid, stalls, noOfCow)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        // System.out.println(aggressiveCowsBruteForce(stalls, k));
        System.out.println(aggressiveCowsOptimal(stalls, k));
    }
}
