package Heap_12.Learning;

import java.util.LinkedList;
import java.util.Queue;

public class App01_NormalQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(400);
        queue.add(5);
        queue.add(6);
        // in the normal queue the way element get stored in the same ordered it get out
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
