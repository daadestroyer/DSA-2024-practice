package Arrays_06.Medium;

public class App06_MaximumSubArray_PrintSubArray_KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int csum = 0;
        int osum = Integer.MIN_VALUE;
        int startIdx = -1;
        int endIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (csum == 0) {
                startIdx = i;
            }
            csum += arr[i];
            if (csum > osum) {
                osum = csum;
                endIdx = i;
            }
            if (csum < 0) {
                csum = 0;
            }
        }
        for (int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
