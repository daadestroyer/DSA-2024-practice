package Stack_Queue_10.Problems;

public class App11_RainWaterTrapping {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = height.length;
        int[] nearestLeftHighest = new int[n];
        int[] nearestRightHighest = new int[n];
        nearestLeftHighest[0] = height[0];
        for (int i = 1; i < n; i++) {
            nearestLeftHighest[i] = Math.max(nearestLeftHighest[i - 1], height[i]);
        }
        nearestRightHighest[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            nearestRightHighest[j] = Math.max(nearestRightHighest[j + 1], height[j]);
        }
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(nearestLeftHighest[i], nearestRightHighest[i]) - height[i];
        }
        System.out.println(totalWater);
    }
}
