package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App01_KoKoEatingBananas_875 {

    public static boolean kokoCanEat(int minBanana, int[] piles, int h) {
        int minHours = 0;
        for (int i : piles) {
            // (5 + 3 -1 ) / 3
            minHours += Math.ceil((double) i / (double) minBanana);
        }
        return minHours <= h;
    }

    static int kokoEatingBananas(int[] piles, int h) {
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();

        while (lo <= hi) {
            int minBanana = (lo + hi) / 2;
            if (kokoCanEat(minBanana, piles, h)) {
                hi = minBanana - 1;
            } else {
                lo = minBanana + 1;
            }
        }
        return lo;
    }


    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int res = kokoEatingBananas(piles, h);
        System.out.println(res);

    }
}
