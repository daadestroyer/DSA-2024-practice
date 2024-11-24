package BinarySearch_08.Medium;

public class App07_RowWithMax1s {
    static int rowWithMax1s(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length-1;
        int n = arr.length;
        int j = c-1;
        int maxOnes = -1;

        for(int i=0 ; i<n ; i++){
            while(j >= 0 && arr[i][j] == 1){
                maxOnes = i;
                j--;
            }
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        int res = rowWithMax1s(arr);
        System.out.println(res);
    }
}
