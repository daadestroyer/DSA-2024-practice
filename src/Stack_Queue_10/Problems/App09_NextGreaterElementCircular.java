package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class App09_NextGreaterElementCircular {
    public static int[] findNextGreaterElement(int[] nums) {
        Stack<Integer> st = new Stack();
        int n = nums.length;
        int[] res = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n * 2 ; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i % n]){
                System.out.println(map);
                map.put(st.pop(),nums[i%n]);
                System.out.println(map);
            }
            if(i < n)
                st.push(i);
        }
        for(int i=0 ; i<nums.length ; i++){
            res[i] = map.getOrDefault(i,-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1}; // OP : {2,-1,2};


        System.out.println(Arrays.toString(findNextGreaterElement(nums1)));
    }
}
