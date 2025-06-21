class Solution:
    def maxDepth(self, s: str) -> int:
        maxcount=float('-inf')
        count=0
        for i in range(len(s)):
            if s[i]=='(':
                count+=1
            if s[i]==')':
                count-=1
            maxcount=max(count,maxcount)
        return maxcount
            
        