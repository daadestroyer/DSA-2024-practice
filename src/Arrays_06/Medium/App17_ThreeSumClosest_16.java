package Arrays_06.Medium;

public class App17_ThreeSumClosest_16 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = nums[0] + nums[1] + nums[2];
        for (int low = 0; low < nums.length - 2; low++) {
            int mid = low + 1;
            int high = nums.length - 1;

            while (mid < high) {
                int sum = nums[low] + nums[mid] + nums[high];

                if(Math.abs(target - sum) < Math.abs(target-result)){
                    result = sum;
                }
                else if(sum < target){
                    mid++;
                }
                else{
                    high--;
                }
            }
        }
        System.out.println(result);
    }
}
