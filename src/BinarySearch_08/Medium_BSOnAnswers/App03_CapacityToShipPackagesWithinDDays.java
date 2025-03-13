package BinarySearch_08.Medium_BSOnAnswers;

public class App03_CapacityToShipPackagesWithinDDays {

    private static int findDay(int capacity, int[] weights) {
        int requiredDay = 1;
        int currentLoad = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (currentLoad + weights[i] <= capacity) {
                currentLoad += weights[i];
            } else {
                requiredDay++;
                currentLoad = weights[i];
            }
        }
        return requiredDay;
    }

    public static int bruteForceApproach(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : weights) {
            maxi = Math.max(maxi, i);
            sum += i;
        }
        for (int i = maxi; i <= sum; i++) {
            if (findDay(i, weights) <= days) {
                return i;
            }
        }
        return -1;

    }

    public static int optimalApproach(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i : weights) {
            high += i;
            low = Math.max(low, i);
        }
        while(low <= high){
            int day = (low+high)/2;
            if(findDay(day,weights) <= days){
                high = day-1;
            }
            else{
                low = day+1;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        // System.out.println(bruteForceApproach(weights, days));
        System.out.println(optimalApproach(weights, days));

    }
}
