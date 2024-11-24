package BinarySearch_08.Medium;

import java.util.Arrays;

public class App09FindAPeakElement2 {
    public static int findMaxInCol(int[][] arr, int col) {
        int idx = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[i][col] > arr[idx][col]) {
                idx = i;
            }
        }
        return idx;
    }

    public static int[] findMax(int[][] arr) {
        int startCol = 0;
        int endCol = arr[0].length - 1;
        int mid = 0;
        while (startCol <= endCol) {
            mid = (startCol + endCol) / 2;
            int maxi = findMaxInCol(arr, mid);
            boolean leftBig = false;
            boolean rightBig = false;

            if (mid - 1 >= 0) {
                if (arr[maxi][mid - 1] > arr[maxi][mid]) {
                    leftBig = true;
                }
            }
            if (mid + 1 <= arr[0].length) {
                if (arr[maxi][mid + 1] > arr[maxi][mid]) {
                    rightBig = true;
                }
            }
            if (leftBig == false && rightBig == false) {
                return new int[]{maxi, mid};
            } else if (leftBig) {
                endCol = mid - 1;
            } else {
                startCol = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {3, 2}};
        int[] res = findMax(arr);
        System.out.println(Arrays.toString(res));
    }
}
