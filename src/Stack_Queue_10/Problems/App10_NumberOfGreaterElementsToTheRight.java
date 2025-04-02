package Stack_Queue_10.Problems;

import java.util.TreeSet;

public class App10_NumberOfGreaterElementsToTheRight {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int queries = 2;
        int[] indices = {0, 5};

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(4);
        ts.add(2);
        ts.add(7);
        ts.add(5);
        ts.add(8);
        ts.add(10);
        ts.add(6);
        System.out.println(ts.tailSet(8+1));


    }
}
