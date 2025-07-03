from typing import List

class Solution:
    def shortestPathAllKeys(self, grid: List[str]) -> int:
        R = len(grid)
        C = len(grid[0])
        keys = 0
        queue = []

        # Initialize visited array as 3D list [row][col][key_mask]
        visited = [[[False] * 64 for _ in range(C)] for _ in range(R)]

        # Find number of keys and starting point
        for r in range(R):
            for c in range(C):
                if 'a' <= grid[r][c] <= 'f':
                    keys += 1
                elif grid[r][c] == "@":
                    queue.append([r, c, 0, 0])  # row, col, moves, key_mask
                    visited[r][c][0] = True

        while queue:
            pos = queue.pop(0)
            row, col, move, flag = pos

            if flag == (1 << keys) - 1:
                return move  # All keys collected

            for dr, dc in [[0, 1], [1, 0], [-1, 0], [0, -1]]:
                ar, ac = row + dr, col + dc

                if 0 <= ar < R and 0 <= ac < C:
                    cell = grid[ar][ac]

                    if cell == "#":
                        continue

                    # Lock: skip if you don't have the key
                    if 'A' <= cell <= 'F' and not (flag & (1 << (ord(cell) - ord('A')))):
                        continue

                    # Update key mask
                    newflag = flag
                    if 'a' <= cell <= 'f':
                        newflag = newflag | (1 << (ord(cell) - ord('a')))

                    if not visited[ar][ac][newflag]:
                        visited[ar][ac][newflag] = True
                        queue.append([ar, ac, move + 1, newflag])

        return -1
