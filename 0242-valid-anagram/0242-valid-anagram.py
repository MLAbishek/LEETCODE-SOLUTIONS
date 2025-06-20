class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        w1=[0]*26
        w2=[0]*26
        if(len(s) != len(t)):
            return False
        for i in range(len(s)):
            w1[ord(s[i])-ord('a')]+=1
            w2[ord(t[i])-ord('a')]+=1
        
        if w1!=w2:
            return False
        print(w1)
        print(w2)
        return True

        