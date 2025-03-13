package BinarySearch_08.Basic_BSOn1DArray;

import java.util.*;

public class App06_SingleElementInASortedArray_540 {

    public static int bruteForce(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int single = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1){
                single = key;
            }
        }
        return single;
    }
    public static int optimalSolution(int[] nums){
        int element = 0;
        int occurence = 0;
        Arrays.sort(nums);
        for(int i : nums){
            if(occurence == 0){
                element = i;
                occurence++;
            }
            else if(element == i){
                occurence--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int n = nums.length;
        // System.out.println(bruteForce(nums));
        System.out.println(optimalSolution(nums));

    }
}
