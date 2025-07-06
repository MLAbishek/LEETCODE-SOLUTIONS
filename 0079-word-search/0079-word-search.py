class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def dfs(R,C,row,col,board,word,index):
            if(len(word)==index):
                return True
            
            directions=[[-1,0],[1,0],[0,1],[0,-1]]
            for dr,dc in directions:
                adjr=row+dr
                adjc=col+dc
                if(adjr<R and adjr>=0 and adjc<C and adjc>=0 and visit[adjr][adjc]==0 and board[adjr][adjc]==word[index]):
                    visit[adjr][adjc]=1
                    flag=dfs(R,C,adjr,adjc,board,word,index+1)
                    if(flag):
                        return True
            visit[row][col]=0
            return False

                    






        visit=[]
        R,C=len(board),len(board[0])
        #initialising the flag array
        for row in range(R):
            visit.append([])
            for col in range(C):
                visit[row].append(0)
        #Traversing the array
        index=0
        for row in range(R):
            for col in range(C):
                if(board[row][col]==word[index]):#checking the start of the word in the board
                    visit[row][col]=1
                    found=dfs(R,C,row,col,board,word,index+1)
                    if(found):
                        return True
        return False
        