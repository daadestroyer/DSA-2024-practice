package SlidingWindow_TwoPointer_11;

import java.util.HashMap;
import java.util.HashSet;

public class App03_Length_Of_Longest_SubArray_Containing_At_Most_Two_Distinct_Integers {
    public static int bruteForce(int[] arr) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> st = new HashSet<>();
            for (int j = i; j < n; j++) {
                st.add(arr[j]);
                if (st.size() <= 2) {
                    len = Math.max(len, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return len;
    }

    public static int optimalSolution(int[] arr){
        // 1 2 1
        int len = 0;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0 ; right < n ; right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            // if size of map is > 2 keep shrinking window
            if(map.size() > 2){
                // keep on decrementing element count from left side
                map.put(arr[left],map.get(arr[left])-1);
                // by decrementing it if it becomes zero, remove from map
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }

            len = Math.max(len , right - left + 1);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        // System.out.println(bruteForce(arr));
        System.out.println(optimalSolution(arr));
    }
}
