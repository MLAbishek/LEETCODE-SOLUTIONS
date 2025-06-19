class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        minlen=float('inf')
        minind=0
        n=len(strs)
        for i in range(n):
            if(len(strs[i])<minlen):
                minlen=len(strs[i])
                minind=i
        
        minword=strs[minind]
        ans=""
        flag=0
        for j in range(len(minword)):
            for k in range(n-1):
                if strs[k][j]!=strs[k+1][j]:
                    return ans
            ans+=strs[0][j]
           
        return ans




        