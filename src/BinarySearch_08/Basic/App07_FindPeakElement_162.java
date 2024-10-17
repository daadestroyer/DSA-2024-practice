package BinarySearch_08.Basic;

public class App07_FindPeakElement_162 {
    static int findPeakElement(int[] nums, int len) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < nums[mid + 1]) {
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int ans = findPeakElement(nums, nums.length);
        System.out.println(ans);
    }
}
