package Recursion_12.Easy;

public class App07_CheckArrayPalindrome {
    public static boolean checkPalindrome(int[] arr, int low, int hi) {
        if (low > hi) {
            return true;
        }
        if (arr[low] != arr[hi]) {
            return false;
        } else {
            return checkPalindrome(arr, low + 1, hi - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(checkPalindrome(arr, 0, arr.length - 1));
    }
}
