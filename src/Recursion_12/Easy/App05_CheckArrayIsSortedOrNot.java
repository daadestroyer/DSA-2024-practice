package Recursion_12.Easy;

public class App05_CheckArrayIsSortedOrNot {

    public static boolean checkArraySorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx] + 1) {
            return false;
        } else {
            return checkArraySorted(arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(checkArraySorted(new int[]{1, 2, 3, 4, 5}, 0));
        System.out.println(checkArraySorted(new int[]{1, 2, 3, 6, 4}, 0));
    }
}
