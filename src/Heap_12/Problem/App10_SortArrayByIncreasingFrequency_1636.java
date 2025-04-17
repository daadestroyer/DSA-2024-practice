package Heap_12.Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

/*
Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array.


 */
public class App10_SortArrayByIncreasingFrequency_1636 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // if two no's a and b have same freq then return b-a which means b comes first (descending order)
        // if freq are different it return map.get(a) - map.get(b) a comes first (increasing order)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b));
        for (int i : nums) {
            minHeap.add(i);
        }
        int i = 0;
        while (!minHeap.isEmpty()) {
            nums[i++] = minHeap.poll();
        }

        System.out.println(Arrays.toString(nums));
    }

}
