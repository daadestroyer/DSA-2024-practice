package Heap_12.Problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:
|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 */
public class App08_KClosestElement_658 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Math.abs(a - x) < Math.abs(b - x) ? 1 : -1);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }
        Collections.sort(al);
        System.out.println(al);

    }
}
