package Heap_12.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class App09_TopKFrequentElements_347 {

    private static int[] topKFreqElements(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            minHeap.add(key);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        while (!minHeap.isEmpty()) {
            list.add(minHeap.poll());
        }
        return list.stream().sorted().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFreqElements(nums, k)));
    }
}
