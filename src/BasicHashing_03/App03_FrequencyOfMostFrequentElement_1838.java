package BasicHashing_03;

public class App03_FrequencyOfMostFrequentElement_1838 {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;

        int left = 0, right = 0;
        int res = 0;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];
            if (nums[right] * (right - left + 1) > sum + k) {
                sum -= nums[left];
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }

        System.out.println(res);

    }
}
