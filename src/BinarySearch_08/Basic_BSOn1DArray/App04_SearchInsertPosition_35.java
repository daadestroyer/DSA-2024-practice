package BinarySearch_08.Basic_BSOn1DArray;

public class App04_SearchInsertPosition_35 {
    static int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int hi = nums.length - 1;
        while (low <= hi) {
            int mid = (low + hi) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int res = searchInsertPosition(nums, target);
        System.out.println(res);
    }
}
