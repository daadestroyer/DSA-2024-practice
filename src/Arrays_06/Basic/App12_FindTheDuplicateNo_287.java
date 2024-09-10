package Arrays_06.Basic;

import java.util.Arrays;
import java.util.HashSet;

public class App12_FindTheDuplicateNo_287 {
    public static int approach1(int[] nums, int n) {
        int[] dummy = new int[n];
        for (int i : nums) {
            dummy[i]++;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dummy[i] > 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int approach2(int[] nums, int length) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (!hs.contains(i)) {
                hs.add(i);
            } else {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        // int ans = approach1(nums, nums.length);
        int ans = approach2(nums, nums.length);
        System.out.println(ans);
    }


}
