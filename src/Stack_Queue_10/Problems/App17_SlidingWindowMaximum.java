package Stack_Queue_10.Problems;

import java.util.*;

public class App17_SlidingWindowMaximum {
    public static int[] bruteForce(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int lo = 0;
        int hi = k - 1;
        while (hi < n) {
            int max = Integer.MIN_VALUE;
            for (int i = lo; i <= hi; i++) {
                max = Math.max(max, nums[i]);
            }
            lo++;
            hi++;
            list.add(max);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] optimalApproach(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            // check if element is of window, if it is remove it
            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.removeFirst();
            }
            // if the last element present inside queue is smaller than incoming element, then remove it
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);

            // if the first element from queue is out of window then remove it and add to list
            if (i >= k - 1) {
                list.add(nums[queue.peekFirst()]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        // System.out.println(Arrays.toString(bruteForce(nums, k)));
        System.out.println(Arrays.toString(optimalApproach(nums, k)));
    }
}
