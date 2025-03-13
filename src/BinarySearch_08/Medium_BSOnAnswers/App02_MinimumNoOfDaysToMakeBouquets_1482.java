package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App02_MinimumNoOfDaysToMakeBouquets_1482 {
    public static boolean ifCanBloom(int minDayForBlooming, int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        int noOfBookayFormed = 0;      // No of bookay going to formed
        int bloomedFlowerTillNow = 0;  // No of consecutive bloomed flower count
        for (int day : bloomDay) {
            if (day <= minDayForBlooming) {
                bloomedFlowerTillNow++; // means the ith flower is bloomed before minDayForBlooming
            }
            // if not then count the total consecutive bloomed flower and form a bookay
            else {
                noOfBookayFormed += bloomedFlowerTillNow / k;
                bloomedFlowerTillNow = 0;
            }
        }
        noOfBookayFormed += bloomedFlowerTillNow / k;
        return noOfBookayFormed >= m;
    }

    public static int bruteForce(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        long totalBookayReq = (long) m * k; // prevent integer overflow
        if (totalBookayReq > len) {
            return -1; // Not enough flowers
        }
        int minDayReqToBloom = Arrays.stream(bloomDay).min().getAsInt();
        int maxDayReqToBloom = Arrays.stream(bloomDay).max().getAsInt();

        // apply binary search
        int lo = minDayReqToBloom;
        int hi = maxDayReqToBloom;
        while (lo <= hi) {
            int minDayForBlooming = (lo + hi) / 2;
            if (ifCanBloom(minDayForBlooming, bloomDay, m, k)) {
                hi = minDayForBlooming - 1;
            } else {
                lo = minDayForBlooming + 1;
            }
        }
        return lo;
    }



    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7}; // array tells ith flower will bloom at what day
        int m = 2; // min no of bookay required
        int k = 3; // how many different flowers needed
         System.out.println(bruteForce(bloomDay, m, k));
    }
}
