package Arrays_06.Hard;

public class App09_MaximumProductSubArray_152 {


    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], nums[i] * maxProd);
            minProd = Math.min(nums[i], nums[i] * minProd);
            res = Math.max(res, maxProd);
        }

    }
}
