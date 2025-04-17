package Heap_12.Problem;

import java.util.PriorityQueue;

public class App06_KthLargestElementInArray_215 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // to find kth Largest Element in Array we need to create min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int res = minHeap.peek();
        System.out.println("Kth Largest Element = "+res);

    }
}
