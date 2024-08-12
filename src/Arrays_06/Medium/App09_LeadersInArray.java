package Arrays_06.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App09_LeadersInArray {
    static List<Integer> bruteForce(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    static List<Integer> optimalApproach(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int biggestNo = arr[arr.length - 1];
        list.add(biggestNo);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > biggestNo) {
                list.add(arr[i]);
                biggestNo = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        // List<Integer> res = bruteForce(arr);
        List<Integer> res = optimalApproach(arr);
        System.out.println(res);

    }
}
