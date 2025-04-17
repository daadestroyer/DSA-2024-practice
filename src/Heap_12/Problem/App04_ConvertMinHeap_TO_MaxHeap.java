package Heap_12.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class App04_ConvertMinHeap_TO_MaxHeap {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 21, 23};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        int[] res = pq.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(res));
    }
}
