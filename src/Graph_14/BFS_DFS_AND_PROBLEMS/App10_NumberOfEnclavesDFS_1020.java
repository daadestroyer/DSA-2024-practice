package Graph_14.BFS_DFS_AND_PROBLEMS;

public class App10_NumberOfEnclavesDFS_1020 {
    public static void applyDFS(int currRow, int currCol, int[][] grid, int[][] vis, int[] dx, int[] dy) {
        int row = grid.length;
        int col = grid[0].length;
        vis[currRow][currCol] = 1;
        for (int i = 0; i < 4; i++) {
            int newRow = currRow + dx[i];
            int newCol = currCol + dy[i];

            if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 1 && vis[newRow][newCol] == 0) {
                applyDFS(newRow, newCol, grid, vis, dx, dy);
            }
        }
    }

    public static int solve(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int[][] vis = new int[R][C];
        // for row
        for (int j = 0; j < C; j++) {
            if (grid[0][j] == 1 && vis[0][j] == 0) {
                applyDFS(0, j, grid, vis, dx, dy);
            }
            if (grid[R - 1][j] == 1 && vis[R - 1][j] == 0) {
                applyDFS(R - 1, j, grid, vis, dx, dy);
            }
        }
        // for col
        for (int i = 0; i < R; i++) {
            if (grid[i][0] == 1 && vis[i][0] == 0) {
                applyDFS(i, 0, grid, vis, dx, dy);
            }
            if (grid[i][C - 1] == 1 && vis[i][C - 1] == 0) {
                applyDFS(i, C - 1, grid, vis, dx, dy);
            }
        }
        // count enclave
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int ans = solve(grid);
        System.out.println(ans);
    }
}
