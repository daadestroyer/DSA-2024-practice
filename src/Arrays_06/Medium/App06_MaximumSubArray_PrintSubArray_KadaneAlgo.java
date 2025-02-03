package Arrays_06.Medium;

public class App06_MaximumSubArray_PrintSubArray_KadaneAlgo {
    private static void printSubArrayHavingMaxSum(int[] arr) {
        int csum = 0;
        int osum = Integer.MIN_VALUE;
        int startIdx = -1;
        int endIdx = -1;
        int tempStartIdx = 0;  // Temporary index to track the start of a potential subarray

        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];

            // If we found a new maximum sum, update the result indices
            if (csum > osum) {
                osum = csum;
                startIdx = tempStartIdx;  // The starting index of the current subarray
                endIdx = i;
            }

            // If csum becomes negative, reset it and update the temporary start index
            if (csum < 0) {
                csum = 0;
                tempStartIdx = i + 1;  // The next element could be the new start of the subarray
            }
        }

        // Print the subarray
        for (int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum sum: " + osum);
    }
    public static void main(String[] args) {
        int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6}; // 6 -2 -3 1 5


        printSubArrayHavingMaxSum(arr);

    }

}
