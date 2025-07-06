package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.LinkedList;
import java.util.Queue;

public class App04_RottingOranges_BFS_994 {
    public static int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> rotten_oranges = new LinkedList<>();
        int fresh_oranges = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    // rotten add to queue
                    rotten_oranges.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    // count fresh oranges
                    fresh_oranges++;
                }
            }
        }
        if (fresh_oranges == 0) {
            return 0; // all rotten oranges
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int time = 0;
        while (!rotten_oranges.isEmpty()) {
            int size = rotten_oranges.size();
            boolean thisTimeRotten = false;

            for (int i = 0; i < size; i++) {
                int[] point = rotten_oranges.poll();
                int r = point[0];
                int c = point[1];

                // check all 4 direction
                for (int dir = 0; dir < 4; dir++) {
                    int newRow = r + dx[dir];
                    int newCol = c + dy[dir];

                    // check if newRow and newCol are accessible also does this new position has rotten orange or not
                    if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        rotten_oranges.add(new int[]{newRow, newCol});
                        thisTimeRotten = true;
                        fresh_oranges--;
                    }
                }
            }
            if (thisTimeRotten) {
                time++;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int time = orangesRotting(grid);
        System.out.println(time);
    }
}
