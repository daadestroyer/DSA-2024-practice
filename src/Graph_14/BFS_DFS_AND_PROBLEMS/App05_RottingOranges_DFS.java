package Graph_14.BFS_DFS_AND_PROBLEMS;

public class App05_RottingOranges_DFS {
    private static void applyDFS(int[][] grid, int i, int j, int time) {
        int row = grid.length;
        int col = grid[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        // boundary checks
        if (i < 0 || i >= row || j < 0 || j >= col) {
            return;
        }
        // if cell is empty, return
        if (grid[i][j] == 0) {
            return;
        }
        // Mark the time when it rotted
        grid[i][j] = time;
        if (grid[i][j] > 1 && grid[i][j] < time) {
            return;
        }

        if (i >= 0 && i < row && j >= 0 && j < col && grid[i][j] == 2) {
            for (int dir = 0; dir < 4; dir++) {
                int newRow = i + dx[dir];
                int newCol = j + dy[dir];
                applyDFS(grid, newRow, newCol, time + 1);
            }
        }
    }

    private static int orangesRottingDFS(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    applyDFS(grid, i, j, 2);
                }
            }
        }
        int maxTime = 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // Fresh orange still left
                    return -1;
                }
                maxTime = Math.max(maxTime, grid[i][j]);
            }
        }
        return maxTime - 2; // subtract initial marker
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int time = orangesRottingDFS(grid);
        System.out.println(time);
    }


}
