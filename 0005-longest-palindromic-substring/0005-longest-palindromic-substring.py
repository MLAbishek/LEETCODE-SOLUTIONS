class Solution:
    def longestPalindrome(self, s: str) -> str:
        grid=[]
        n=len(s)
        start=0
        end=0
        for r in range(n):
            grid.append([])
            for c in range(n):
                grid[r].append(0)
        maxlen=0
        for index in range(n):
            row=0
            col=index
            while(row<n and col<n):
                if s[row]==s[col]:
                    if index>2:
                        if grid[row+1][col-1]:
                            if index+1>maxlen:
                                maxlen=index+1
                                start=row
                                end=col
                            grid[row][col]=1
                    else:
                        if index+1>maxlen:
                            maxlen=index+1
                            start=row
                            end=col
                        grid[row][col]=1
                # print(row,col,s[row],s[col],grid[row][col])
                row+=1
                col+=1
        # for i in grid:
            # print(i)
        if maxlen==1:
            return s[0]
        # print(start,end,maxlen)
        return s[start:end+1]
            

