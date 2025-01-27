package Arrays_06.Basic;
import java.util.stream.IntStream;

public class App01_LargestElementInArray {
    public static void basicApproach(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int i : arr) {
            largestElement = Math.max(largestElement, i);
        }
        System.out.println(largestElement);
    }

    public static void approach2(int[] arr) {
        int max = java.util.stream.IntStream.of(arr).max().getAsInt();

        System.out.println(max);
    }

    public static void main(String[] args) {
        // TC:O(N) SC:O(1)
        int[] arr = {1, 8, 7, 56, 90};
        // basicApproach(arr);
        approach2(arr);
    }
}
