package Searching_04;

public class App02_BinarySearch {
    public static int binarySearchIteratively(int[] arr, int low, int hi, int element) {
        if (low <= hi) {
            int mid = (low + hi) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (arr[mid] > element) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecusrive(int[] arr, int lo, int hi, int element) {
        if (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (arr[mid] > element) {
                return binarySearchRecusrive(arr, lo, mid - 1, element);
            } else {
                return binarySearchRecusrive(arr, mid + 1, hi, element);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Time complexity of binary search is O(logn)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 5;
        // int res = binarySearchIteratively(arr, 0, arr.length - 1, element);
        int res = binarySearchRecusrive(arr, 0, arr.length - 1, element);
        System.out.println(res);
    }


}
