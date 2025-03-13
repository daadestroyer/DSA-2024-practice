package BinarySearch_08.Basic_BSOn1DArray;

public class App02_ImplementLowerBoundUsingBinarySearch {
    static int lowerBound(int[] arr, int n, int x) {
        int res = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=x){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 7;
        int x = 0;
        int arr[] = {1,2,8,10,11,12,19};
        System.out.println(lowerBound(arr, n, x));
    }
}
