package Graph_14.BFS_DFS_AND_PROBLEMS;

public class App09_SurroundedRegionsDFS_130 {
    public static void applyDFS(int currRow, int currCol, int[][] vis, char[][] board, int[] dx, int[] dy) {
        int row = board.length;
        int col = board[0].length;
        vis[currRow][currCol] = 1;
        for (int i = 0; i < 4; i++) {
            int newRow = currRow + dx[i];
            int newCol = currCol + dy[i];

            if (newRow >= 0 && newRow < row &&
                    newCol >= 0 && newCol < col &&
                    board[newRow][newCol] == 'O' &&
                    vis[newRow][newCol] == 0) {
                applyDFS(newRow, newCol, vis, board, dx, dy);
            }
        }
    }

    public static void solve(char[][] board) {
        int R = board.length;
        int C = board[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int[][] vis = new int[R][C];

        // check for row
        for (int j = 0; j < C; j++) {  // O(C)
            if (board[0][j] == 'O' && vis[0][j] == 0) {
                applyDFS(0, j, vis, board, dx, dy);
            }
            if (board[R - 1][j] == 'O' && vis[R - 1][j] == 0) {
                applyDFS(R - 1, j, vis, board, dx, dy);
            }
        }
        // check for column
        for (int i = 0; i < R; i++) { // O(R)
            if (board[i][0] == 'O' && vis[i][0] == 0) {
                applyDFS(i, 0, vis, board, dx, dy);
            }
            if (board[i][C - 1] == 'O' && vis[i][C - 1] == 0) {
                applyDFS(i, C - 1, vis, board, dx, dy);
            }
        }

        // Flip unvisited 'O' to 'X' (since they are surrounded)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");  // ✅ fixed
            }
            System.out.println();
        }

        /*
        Time Complexity:
        ----------------
                solve() func
                1. Top & bottom rows    : O(C)
                2. Left & right columns : O(R)
                  == O(R+C)
                3. For each boundary 'O' applyDFS, each cell visited at most once, DFS visit check 4 neighbours
                4. Final traversal to flip 'O' to 'X' == O(R x C)

        Space Complexity:
        -----------------
                1. vis[R][C] array: O(R x C)
                2. dx and dy arrays: O(1)
                3. Recursive call stack:
                    In worst case (all cells are 'O'), DFS depth can go up to O(R x C).

                   O(R x C)

         TC : O(R x C)
         SC : O(R x C)
         */
    }
}
