package Heap_12.Problem;

import java.util.*;

public class App11_TopKFrequentWords_692 {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        // create minHeap
        // if map.get(a) == map.get(b) then return b - a (descending order)
        // else map.get(a) - map.get(b) then return a - b (ascending order)
        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b)->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA == freqB){
                return b.compareTo(a); // sorted by the frequency from highest to lowest
            }
            else{
                return freqA - freqB;
            }
        });
        while (!minHeap.isEmpty()) {
            list.add(minHeap.poll());
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
