package Recursion_12.Easy;

public class App06_GetLastIndexOfNumberInArray {

    public static int getLastIdx(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return -1;
        }
        int index = getLastIdx(arr, idx + 1, ele);
        if (index != -1) {
            return index;
        }
        if (arr[idx] == ele) {
            return idx;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLastIdx(new int[]{1, 2, 3, 4, 5, 1}, 0, 1));
    }
}
