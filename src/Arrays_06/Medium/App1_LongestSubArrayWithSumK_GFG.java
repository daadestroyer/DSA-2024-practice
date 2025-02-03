package Arrays_06.Medium;

import java.util.HashMap;
import java.util.Map;

public class App1_LongestSubArrayWithSumK_GFG {

    public static int optimizeApproach(int[] arr, int n, int k) {
        int slow = 0;
        int fast = 0;
        int len = 0;
        int sum = arr[0];

        while (fast < n) {
            while (slow <= fast && sum > k) {
                sum = sum - arr[slow];
                slow++;
            }
            if (sum == k) {
                len = Math.max(len, fast - slow + 1);
            }
            fast++;
            if (fast < n) {
                sum += arr[fast];
            }
        }

        return len;
    }

    private static int usingHashMap(int[] arr, int n, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
            if (sum == k) {
                len = Math.max(len, i + 1);
            }
            int rem = sum - k;
            if (hm.containsKey(rem)) {
                len = Math.max(len, i - hm.get(rem));
            }

        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;
           //System.out.println(optimizeApproach(arr, arr.length, k));
         System.out.println(usingHashMap(arr, arr.length, k));
    }


}
