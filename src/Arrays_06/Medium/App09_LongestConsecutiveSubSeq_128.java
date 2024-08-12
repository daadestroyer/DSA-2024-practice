package Arrays_06.Medium;

import java.util.HashSet;

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
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        // first add all element into hashmap
        for (int i : nums) {
            set.add(i);
        }
        // now iterate over array check each lesser element of each element exist or not
        // if not exist then count in forward direction check next element exist or not
        // and count the sequence

        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int seq = 0;

                while (set.contains(i)) {
                    i++;
                    seq++;
                }
                res = Math.max(res, seq);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        System.out.println(bruteForceLongestConsecutive(nums));
        System.out.println(optimalApproach(nums));
    }
}
