package Arrays_06.Medium;

import java.util.Arrays;

public class App10_SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZero(matrix, matrix.length, matrix[0].length);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setMatrixZero(int[][] mat, int rowsize , int colsize){
        boolean changed = false;
        for (int i = 0; i <rowsize ; i++) {
            for (int j = 0; j <colsize ; j++) {

                if(mat[i][j] == 0){
                    changed = true;
                    convertZeroToNegativeOne(mat,i,j,rowsize,colsize);
                }

            }
        }
        if(changed){
            for (int i = 0; i <rowsize ; i++) {
                for (int j = 0; j <colsize ; j++) {
                    if(mat[i][j] == -1){
                        mat[i][j] = 0;
                    }
                }
            }
        }
    }

    private static void convertZeroToNegativeOne(int[][] matrix, int R, int C, int rowSize, int colSize) {
        int i=R;
        int j=C;
        // right side convert all the non zeroes values to -1 from this cell
        while(j<colSize){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
            j++;
        }
        // left side convert all the non zeroes values to -1 from this cell
        i=R;
        j=C;
        while(j>=0){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
            j--;
        }
        // upper side convert all the non zeroes values to -1 from this cell
        i=R;
        j=C;
        while(i>=0){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
            i--;
        }
        // lower side convert all the non zeroes values to -1 from this cell
        i=R;
        j=C;
        while(i<rowSize){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
            i++;
        }
    }
}
