package Heap_12.Problem;

import java.util.ArrayList;
import java.util.PriorityQueue;

/*
A k-sorted array  or a nearly sorted array is an array where each element is at most k positions away from its
target position in the sorted array.
 */
public class App07_NearlyKSortedArray_GFG {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        // OP :   = {2, 3, 5, 6, 8, 9, 10}
        // if you see now each element is K step away from their original position
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            // 2 3 5 6
            if (pq.size() > k) {
                al.add(pq.poll());
            }
        }

        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }


        System.out.println(al);
    }
}
