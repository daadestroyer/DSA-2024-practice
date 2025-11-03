package Arrays_06.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App16_ThreeSum_15 {
    public static List<List<Integer>> findRes(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> f_res = new ArrayList<>();
        for (int low = 0; low < nums.length - 2; low++) {
            if (low == 0 || nums[low - 1] != nums[low]) {
                int mid = low + 1;
                int high = nums.length - 1;
                int target = 0 - nums[low];
                while (mid < high) {
                    if (nums[mid] + nums[high] == target) {
                        List<Integer> c_res = Arrays.asList(nums[low], nums[mid], nums[high]);
                        f_res.add(c_res);
                        // if duplicate
                        while(mid < high && nums[mid] == nums[mid+1]){
                            mid++;
                        }
                        while(mid < high && nums[high] == nums[high-1]){
                            high--;
                        }

                        // if not duplicate
                        mid++;
                        high--;
                    } else if (nums[mid] + nums[high] > target) {
                        high--;
                    } else {
                        mid++;
                    }
                }
            }
        }
        return f_res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = findRes(nums);
        System.out.println(res);
    }
}
