class Solution:
    def solve(self, N, row, res, rf, cf, t1f, t2f, board,a):
        if row == N:
            ans = []
            for r in range(N):
                ans.append("".join(board[r]))
            res.append(ans)
            a[0]+=1
            return

        for col in range(N):
            if rf[row] or cf[col] or t1f[row + col] or t2f[N - 1 - row + col]:
                continue

            rf[row] = 1
            cf[col] = 1
            t1f[row + col] = 1
            t2f[N - 1 - row + col] = 1
            board[row][col] = "Q"

            self.solve(N, row + 1, res, rf, cf, t1f, t2f, board,a)

            rf[row] = 0
            cf[col] = 0
            t1f[row + col] = 0
            t2f[N - 1 - row + col] = 0
            board[row][col] = "."

    def totalNQueens(self, N: int) -> List[List[str]]:
        res = []
        rf = [0] * N
        cf = [0] * N
        t1f = [0] * (2 * N - 1)
        t2f = [0] * (2 * N - 1)
        board = []
        a=[0]
        for r in range(N):
            board.append([])
            for c in range(N):
                board[r].append(".")
        self.solve(N, 0, res, rf, cf, t1f, t2f, board,a)
        return a[0]
