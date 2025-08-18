package Graph_14.BFS_DFS_AND_PROBLEMS;

public class App11_WordSearch_79 {
    public static boolean applyDFS(char[][] board, String word, boolean[][] vis, int currRow, int currCol,
                                   int[] dx, int[] dy, int idx) {
        int row = board.length;
        int col = board[0].length;

        // possitive base case
        if (idx == word.length()) {
            return true;
        }
        // negative base case
        // if out of bounds, if already visited, if found wrong character
        if (currRow < 0 || currRow >= row || currCol < 0 || currCol >= col || vis[currRow][currCol] || board[currRow][currCol] != word.charAt(idx)) {
            return false;
        }

        // mark visited
        vis[currRow][currCol] = true;
        for (int d = 0; d < 4; d++) {
            int newRow = currRow + dx[d];
            int newCol = currCol + dy[d];
            if (applyDFS(board, word, vis, newRow, newCol, dx, dy, idx + 1)) {
                return true;
            }
        }
        // backtrack and mark uanvisited
        vis[currRow][currCol] = false;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        boolean[][] vis = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (applyDFS(board, word, vis, i, j, dx, dy, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E' }, {'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' }};
        String word = "ABCCED";

        boolean res = exist(board, word);
        System.out.println(res);
    }
}
