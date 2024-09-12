package Arrays_06.Medium;

public class App14_SearchInA2DMatrix_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 20;

        // TC: O(m * N) SC: O(1)
        // boolean res = searchMatrixBruteForce(matrix, target);
        boolean res = optimalApproach(matrix,target);
        System.out.println(res);
    }

    private static boolean optimalApproach(int[][] matrix , int target){
        int i=0;
        int j = matrix[0].length-1;

        while(i<matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    private static boolean searchMatrixBruteForce(int[][] matrix, int target) {
        boolean res = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }
}
