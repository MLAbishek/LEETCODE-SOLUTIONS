class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        left=[0]*26
        right=[0]*26
        ans=set()
        for i in range(1,len(s)):
            pos=ord(s[i])-ord("a")
            right[pos]+=1
        
        pos=ord(s[0])-ord("a")
        left[pos]+=1
        for i in range(1,len(s)):
            pos=ord(s[i])-ord("a")
            right[pos]-=1
            mid=s[i]
            for i in range(26):
                if left[i]*right[i]>0:
                    char=chr(ord("a")+i)
                    word=char+mid+char
                    ans.add(word)
            left[pos]+=1
        return len(ans)

