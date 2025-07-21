package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.LinkedList;
import java.util.Queue;

public class App06_FloodFill_733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        int start_pos_color = image[sr][sc];

        if (start_pos_color == color) {
            return image;
        }
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{sr, sc});
        image[sr][sc] = color;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while (!qu.isEmpty()) {
            int[] point = qu.poll();
            int r = point[0];
            int c = point[1];
            for (int dir = 0; dir < 4; dir++) {
                int newRow = r + dx[dir];
                int newCol = c + dy[dir];
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && image[newRow][newCol] == start_pos_color) {
                    image[newRow][newCol] = color;
                    qu.add(new int[]{newRow, newCol});
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] flood = floodFill(image, sr, sc, color);
        for (int i = 0; i < flood.length; i++) {
            for (int j = 0; j < flood[0].length; j++) {
                System.out.print(flood[i][j] + " ");
            }
            System.out.println();
        }

    }
}
