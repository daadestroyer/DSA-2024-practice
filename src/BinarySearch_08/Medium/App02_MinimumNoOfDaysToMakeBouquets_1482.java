package BinarySearch_08.Medium;

public class App02_MinimumNoOfDaysToMakeBouquets_1482 {
    static boolean possible(int day, int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int noOfB = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

    static int createBookayBruteForce(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int val = m * k;
        if (val > n) {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            mini = Math.min(mini, day);
            maxi = Math.max(maxi, day);
        }
        for (int day = mini; day <= maxi; day++) {
            if (possible(day, bloomDay, m, k)) {
                return day;
            }
        }
        return -1;
    }

    static int createBookayOptimal(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int val = m * k;
        if (val > n) {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            mini = Math.min(day, mini);
            maxi = Math.max(day, maxi);
        }
        int lo = mini;
        int hi = maxi;
        while (lo <= hi) {
            int day = (lo + hi) / 2;
            if (possible(day, bloomDay, m, k)) {
                hi = day- 1;
            }
            else{
                lo = day + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2, k = 3;
        // System.out.println(createBookayBruteForce(bloomDay, m, k));
        System.out.println(createBookayOptimal(bloomDay, m, k));
    }
}
