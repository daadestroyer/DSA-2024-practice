package BinarySearch_08.Medium_BSOnAnswers;

import java.util.*;

public class App11_KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7, 9};
        int b[] = {1, 4, 8, 10};
        int k = 5;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i : a) {
            al.add(i);
        }
        for (int i : b) {
            al.add(i);
        }

        System.out.println(al.get(k-1));


    }
}
