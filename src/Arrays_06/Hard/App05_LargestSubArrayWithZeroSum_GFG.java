package Arrays_06.Hard;

import java.util.HashMap;

public class App05_LargestSubArrayWithZeroSum_GFG {
    static int bruteForce(int[] arr, int n) {
        int sum = 0;
        int maxL = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }
        return maxL;
    }

    static int optimalApproach(int[] arr, int n) {
        int sum = 0;
        int maxL = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxL = Math.max(maxL, i + 1);
            } else {
                if (hm.containsKey(sum)) {
                    maxL = Math.max(maxL, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }
        }
        return maxL;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        // int res = bruteForce(arr, n);
        int res = optimalApproach(arr, n);
        System.out.println(res);
    }
}
