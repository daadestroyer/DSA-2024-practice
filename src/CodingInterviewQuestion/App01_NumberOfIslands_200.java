package CodingInterviewQuestion;

public class App01_NumberOfIslands_200 {
    public static void applyDFS(char[][]grid,int i,int j,int rows,int cols){
        if(i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0'; // vis
        // explore all 4 dir
        applyDFS(grid,i+1,j,rows,cols);
        applyDFS(grid,i-1,j,rows,cols);
        applyDFS(grid,i,j-1,rows,cols);
        applyDFS(grid,i,j+1,rows,cols);
    }
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length ==0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    applyDFS(grid,i,j,rows,cols);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
