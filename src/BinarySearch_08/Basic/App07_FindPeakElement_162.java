package BinarySearch_08.Basic;

public class App07_FindPeakElement_162 {


    public static int approach1_ON(int[] nums) {
        int res = 0;
        int len = nums.length;

        if (len == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[len - 1] > nums[len - 2]) {
            return len - 1;
        }
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static int approach2_ONLogN(int[] nums) {
        int len = nums.length - 1;
        int lo = 0;
        int hi = len - 1;
        while (lo < hi) {
            int mid  = (lo + hi) /2;
            if(nums[mid] < nums[mid + 1]){
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int ans = approach1_ON(nums); // O(N)
        // System.out.println(ans);

        System.out.println(approach2_ONLogN(nums));


    }
}
