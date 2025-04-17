package Heap_12.Problem;

public class App03_CheckIfArrayRepresentsMinHeapOrNot {
    public static boolean check(int[] nums) {
        // only thing need to check is last parent node
        int n = nums.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int leftChildIdx = 2 * i + 1;
            int rightChildIdx = 2 * i + 2;
            if (leftChildIdx < n && nums[i] > nums[leftChildIdx]) {
                return false;
            }
            if (rightChildIdx < n && nums[i] > nums[rightChildIdx]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 25, 15};

        boolean res = check(nums);
        System.out.println(res);

    }
}
