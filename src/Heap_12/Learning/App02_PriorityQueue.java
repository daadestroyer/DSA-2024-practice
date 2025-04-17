package Heap_12.Learning;

import java.util.PriorityQueue;
import java.util.Queue;

public class App02_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(100);
        pq.add(300);
        pq.add(2);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }




    }
}
