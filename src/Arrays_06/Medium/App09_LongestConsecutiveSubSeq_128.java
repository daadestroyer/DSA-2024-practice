package Arrays_06.Medium;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App09_LongestConsecutiveSubSeq_128 {
    static boolean linearSearch(int[] nums, int element) {
        for (int no : nums) {
            if (no == element) {
                return true;
            }
        }
        return false;
    }

    public static int bruteForceLongestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            int count = 1;
            while (linearSearch(nums, element + 1) == true) {
                element++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static int optimalApproach(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums) {
            st.add(i);
        }
        int maxLen = 0;
        for (int i : nums) {
            if (!st.contains(i - 1)) {
                int startnum = i;
                int currLen = 1;
                while (st.contains(startnum + 1)) {
                    currLen += 1;
                    startnum += 1;
                    st.remove(startnum); // this is important this reduces redundancy
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        System.out.println(bruteForceLongestConsecutive(nums));
        System.out.println(optimalApproach(nums));
    }
}
