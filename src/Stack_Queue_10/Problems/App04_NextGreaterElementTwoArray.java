package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class App04_NextGreaterElementTwoArray {

    public static int[] nextGreater(int[] nums1, int[] nums2) {

        // next greater element means monotonic decreasing
        // means we need to iterate from right to left
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // create monotonic decreasing stack
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                // here we are storing next greater for each element
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        // now iterate over the nums1 again and check the next greater element
        // from map
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreater(nums1, nums2)));
    }
}
