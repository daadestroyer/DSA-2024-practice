package Heap_12.Problem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class App05_KthSmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;

        // to find kth Smallest Element in Array we need to create max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr){
            maxHeap.add(i);
            while(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        System.out.println("Kth Smallest Element = "+maxHeap.peek());
    }
}
