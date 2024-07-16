import java.util.*;

public class Main {
    public static void countFrequencies(int[] arr, int n) {
        // Step 1: Increase values at indexes based on elements found
        for (int i = 0; i < n; i++) {
            // Find index to increment
            int index = arr[i] % n;
            if (index != 0) {
                arr[index - 1] += n;
            }
        }
        System.out.println(Arrays.toString(arr));
        // Step 2: Calculate frequencies based on modified values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3,3,3,3};
        HashMap<Integer, Integer> hm = new HashMap<>();

        bruteForceApproach(arr, n, hm);
        System.out.println(Arrays.toString(arr));


    }

    private static void bruteForceApproach(int[] arr, int n, HashMap<Integer, Integer> hm) {
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (hm.containsKey(i)) {
                arr[i-1] = hm.get(i);
            } else {
                arr[i-1] = 0;
            }
        }
    }



}