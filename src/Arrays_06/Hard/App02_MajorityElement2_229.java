package Arrays_06.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App02_MajorityElement2_229 {
    static List<Integer> bruteForceApproach(int[] nums, int n) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n / 3) {
                res.add(entry.getKey());
            }
        }
        return res;
    }

    static List<Integer> optimalApproach(int[] nums, int n) {
        List<Integer> res = new ArrayList<>();
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        for (int i : nums) {
            if (i == num1) {
                count1++;
            } else if (i == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = i;
            } else if (count2 == 0) {
                num2 = i;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == num1) {
                count1++;
            } else if (i == num2) {
                count2++;
            }
        }
        if (count1 > n / 3) {
            res.add(num1);
        }
        if (count2 > n / 3) {
            res.add(num2);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        // List<Integer> res = bruteForceApproach(nums, nums.length);
        List<Integer> res = optimalApproach(nums, nums.length);
        System.out.println(res);
    }
}
