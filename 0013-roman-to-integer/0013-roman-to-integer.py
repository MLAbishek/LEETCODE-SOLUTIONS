class Solution:
    def romanToInt(self, s: str) -> int:
        d={
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000
        }
        amount=0
        i=0
        while(i<len(s)-1):
            if(d[s[i]] < d[s[i+1]]):
                amount += (d[s[i+1]]-d[s[i]])
                i+=2
            else:
                amount += d[s[i]]
                i+=1
        if(i<len(s)):
            amount+=d[s[len(s)-1]]
        return amount
        