package Arrays_06.Medium;

import java.util.ArrayList;

public class App12_SpiralMatrix_54 {
    private static ArrayList<Integer> spiralMatrix(int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int count = (right + 1) * (bottom + 1);
        int dir = 1;

        while (left <= right && top <= bottom) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = top; i <= right; i++) {
                        al.add(matrix[left][i]);
                        count--;
                    }
                }
            }
            dir = 2;
            top++;

            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        al.add(matrix[i][right]);
                        count--;
                    }
                }
            }
            dir = 3;
            right--;

            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        al.add(matrix[bottom][i]);
                        count--;
                    }
                }
            }
            dir = 4;
            bottom--;

            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        al.add(matrix[i][left]);
                        count--;
                    }
                }
            }
            dir = 1;
            left++;
        }
        return al;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> al = spiralMatrix(matrix);
        System.out.println(al);

    }


}
