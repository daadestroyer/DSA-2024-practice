package Arrays_06.Medium;

public class App05_MaximumSubArray_KadanesAlgorithm_53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maximumSubArray(arr);
        System.out.println(res);
    }

    private static int maximumSubArray(int[] arr) {
        int csum = Integer.MIN_VALUE;
        int osum = Integer.MIN_VALUE;
        for (int i : arr) {
            if (csum >= 0) {
                csum += i;
            } else {
                csum = i;
            }
            if (csum > osum) {
                osum = csum;
            }
        }
        return osum;
    }
}
