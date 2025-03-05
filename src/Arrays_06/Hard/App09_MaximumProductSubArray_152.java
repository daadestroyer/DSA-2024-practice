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
            // if in case any negative no came and if we multiply with maxProd it will
            // give more smaller maxProd, that's why we are maintaining minProd also and
            // also checking if any negative number came we will swap minProd and maxProd
            // then after that we will make maxProd accordingly
            maxProd = Math.max(nums[i], nums[i] * maxProd);
            minProd = Math.min(nums[i], nums[i] * minProd);
            System.out.println("maxP = "+maxProd);
            System.out.println("minP = "+minProd);
            res = Math.max(res, maxProd);
        }

        System.out.println(Math.max(-2,-12));

    }
}
