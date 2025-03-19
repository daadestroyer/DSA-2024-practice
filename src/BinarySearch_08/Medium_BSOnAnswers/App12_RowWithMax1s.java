package BinarySearch_08.Medium_BSOnAnswers;

public class App12_RowWithMax1s {
    public static int rowWithMax1s(int arr[][]) {
        int maxOnesRow = -1;
        int row = -1;
        for(int i=0 ; i<arr.length ; i++){
            int ones = 0;
            for(int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] == 1){
                    ones++;
                }
            }
            if(ones > maxOnesRow){
                row = i;
                maxOnesRow = ones;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1},
                       {0, 0, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};
        int res = rowWithMax1s(arr);
        System.out.println(res);
    }
}
