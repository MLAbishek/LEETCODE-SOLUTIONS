class Solution:
    def dfs(self,r,c,grid,R,C,visited):
        def isvalid(r,c,R,C):
            if r<R and r>=0 and c<C and c>=0:
                return True
            else:
                return False
        if not visited[r][c]:
            visited[r][c]=1
            for i in range(r,R):
                if isvalid(i,c,R,C):
                    if grid[i][c]!=0:
                        grid[i][c]=0
                        visited[i][c]=1
            for j in range(r,-1,-1):
                if isvalid(j,c,R,C):
                    if grid[j][c]!=0:
                        grid[j][c]=0
                        visited[j][c]=1
            for k in range(c,C):
                if isvalid(r,k,R,C):
                    if grid[r][k]!=0:
                        grid[r][k]=0
                        visited[r][k]=1
            for l in range(c,-1,-1):
                if isvalid(r,l,R,C):
                    if grid[r][l]!=0:
                        grid[r][l]=0
                        visited[r][l]=1
            

        
        
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        R=len(matrix)
        C=len(matrix[0])
        visited=[]
        for r in range(R):
            visited.append([])
            for c in range(C):
                visited[r].append(0)
        R=len(matrix)
        C=len(matrix[0])
        for r in range(R):
            for c in range(C):
                if matrix[r][c]==0 and not visited[r][c]:
                    self.dfs(r,c,matrix,R,C,visited)

            
                

        
        