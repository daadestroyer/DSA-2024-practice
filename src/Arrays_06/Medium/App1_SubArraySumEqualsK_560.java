package Arrays_06.Medium;

import java.util.HashMap;
import java.util.Map;

public class App1_SubArraySumEqualsK_560 {

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
        hm.put(0, 1); // Important: 1 way to get sum = 0 before we start
        int count = 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;

            // Check if sum - k was previously seen
            if (hm.containsKey(sum - k)) {
                count += hm.get(sum - k);
            }

            // Store/update current sum frequency
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,31};
        int k = 3;
           //System.out.println(optimizeApproach(arr, arr.length, k));
         System.out.println(usingHashMap(arr, arr.length, k));
    }


}
