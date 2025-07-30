class Solution {
    private static void checker(char[][] board, int r, int c, int R, int C, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= R || c >= C || board[r][c] == 'X' || visited[r][c]) {
            return;
        }
        visited[r][c] = true;
        int[][] diff = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int i = 0; i < 4; i++) {
            int dr = diff[i][0];
            int dc = diff[i][1];
            int adjr = dr + r;
            int adjc = dc + c;
            checker(board, adjr, adjc, R, C, visited);
        }
    }

    public void solve(char[][] board) {
        int R = board.length;
        int C = board[0].length;
        boolean[][] visited = new boolean[R][C];
        for (int r = 0; r < R; r++) {
            if (board[r][0] == 'O' && !visited[r][0]) {
                checker(board, r, 0, R, C, visited);
            }
        }
        for (int r = 0; r < R; r++) {
            if (board[r][C - 1] == 'O' && !visited[r][C - 1]) {
                checker(board, r, C - 1, R, C, visited);
            }
        }
        for (int c = 0; c < C; c++) {
            if (board[0][c] == 'O' && !visited[0][c]) {
                checker(board, 0, c, R, C, visited);
            }
        }
        for (int c = 0; c < C; c++) {
            if (board[R - 1][c] == 'O' && !visited[R - 1][c]) {
                checker(board, R - 1, c, R, C, visited);
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
        

    }
}