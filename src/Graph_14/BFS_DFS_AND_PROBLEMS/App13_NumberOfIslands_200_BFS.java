package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.LinkedList;
import java.util.Queue;

public class App13_NumberOfIslands_200_BFS {
    public static void applyBFS(int i, int j, char[][] grid, int[] dx, int[] dy) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        grid[i][j] = '0';
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int r = point[0];
            int c = point[1];

            for (int dir = 0; dir < 4; dir++) {
                int newRow = r + dx[dir];
                int newCol = c + dy[dir];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
                    queue.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }

    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    applyBFS(i, j, grid, dx, dy);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(grid));
    }
}
