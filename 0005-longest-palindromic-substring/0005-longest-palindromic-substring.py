class Solution:
    def longestPalindrome(self, s: str) -> str:
        ans=""
        lenans=0
        if(len(s)==1):
            return s
        if(len(s)==2 and s[0]!=s[1]):
            return s[0]
        for i in range(len(s)):
            l,r=i,i
            while(l>=0 and r<len(s) and s[l]==s[r]):
                templen=r-l
                if(templen > lenans):
                    ans=s[l:r+1]
                    lenans=r-l
                l-=1
                r+=1
            
            l,r=i,i+1
            while(l>=0 and r<len(s) and s[l]==s[r]):
                templen=r-l
                if(templen > lenans):
                    ans=s[l:r+1]
                    lenans=r-l
                l-=1
                r+=1
        if ans=="":
            return s[0]
        return ans


        