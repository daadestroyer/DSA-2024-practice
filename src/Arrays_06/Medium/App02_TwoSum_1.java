package Arrays_06.Medium;

import java.util.*;

public class App02_TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = findTwoSum(nums, target, nums.length);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findTwoSum(int[] nums, int target, int n) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(target - nums[i])) {
                list.add(hm.get(target - nums[i]));
                list.add(i);
            } else {
                hm.put(nums[i], i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
