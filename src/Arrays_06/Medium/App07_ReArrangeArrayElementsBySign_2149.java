package Arrays_06.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App07_ReArrangeArrayElementsBySign_2149 {
    static void bruteForce(int[] nums) {
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> possitive = new ArrayList<>();
        int k = 0;
        for (int i : nums) {
            if (i > 0) {
                possitive.add(i);
            } else {
                negative.add(i);
            }
        }
        int pos = 0;
        int neg = 0;
        while (pos < possitive.size() && neg < negative.size()) {
            nums[k++] = possitive.get(pos++);
            nums[k++] = negative.get(neg++);
        }
    }
    static int[] optimalApproach(int[] nums){
        int[] res = new int[nums.length];
        int evenPointer = 0;
        int oddPointer = 1;
        for(int i : nums){
            if(i > 0){
                res[evenPointer] = i;
                evenPointer += 2;
            }
            else{
                res[oddPointer] = i;
                oddPointer += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        // bruteForce(nums);
        // System.out.println(Arrays.toString(nums));
        int[] res = optimalApproach(nums);
        System.out.println(Arrays.toString(res));
    }
}
