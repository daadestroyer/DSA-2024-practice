package Arrays_06.Medium;

import java.util.Arrays;

public class App15_SetMatrixZero {

    public static void changeNonZeroesToMinusOne(int[][] matrix, int R, int C, int row, int col) {
        int i = R;
        int j = C;
        // do the right side
        while (j < col) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
            j++;
        }
        // do the left side
        i = R;
        j = C;
        while (j >= 0) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
            j--;
        }
        // do the upside
        i = R;
        j = C;
        while (i >= 0) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
            i--;
        }
        // do the downside
        i = R;
        j = C;
        while (i < row) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
            i++;
        }
    }

    public static void setMatrixZero(int[][] matrix, int rowSize, int colSize) {
        // find zero
        boolean no_change = true;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (matrix[i][j] == 0) {
                    no_change = false;
                    changeNonZeroesToMinusOne(matrix, i, j, rowSize, colSize);
                }
            }
        }
        if (!no_change) {
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZero(matrix, matrix.length, matrix[0].length);
        for (int[] arr : matrix) {
            System.out.print(Arrays.toString(arr));
        }
    }
}
