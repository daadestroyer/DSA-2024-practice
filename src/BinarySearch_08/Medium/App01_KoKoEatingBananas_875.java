package BinarySearch_08.Medium;

public class App01_KoKoEatingBananas_875 {
    static int kokoEatingBananas(int[] piles, int h) {
        int lo = 1;
        int hi = 0;
        for (int i : piles) {
            hi = Math.max(hi, i);
        }
        while (lo < hi) {
            int minBanana = (lo + hi) / 2;
            if (ifKoKoCanEat(piles, h, minBanana)) {
                hi = minBanana;
            } else {
                lo = minBanana + 1;
            }
        }
        return lo;
    }

    private static boolean ifKoKoCanEat(int[] piles, int h, int minBanana) {
        int hoursNeeded = 0;
        for (int p : piles) {
            hoursNeeded += p / minBanana;
            if (p % minBanana != 0) {
                hoursNeeded++; // Add extra hour if there's a remainder
            }
        }
        return hoursNeeded <= h;
    }

    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        int res = kokoEatingBananas(piles, h);
        System.out.println(res);

    }
}
