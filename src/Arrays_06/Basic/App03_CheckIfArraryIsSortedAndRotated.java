package Arrays_06.Basic;

public class App03_CheckIfArraryIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int ascendingOrderBreak = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                ascendingOrderBreak++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            ascendingOrderBreak++;
        }
        return ascendingOrderBreak > 1 ? false : true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(check(nums));
    }
}
