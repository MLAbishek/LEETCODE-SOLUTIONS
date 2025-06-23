class Solution:
    def intToRoman(self, num: int) -> str:
        d=[["I",1],["IV",4],["V",5],["IX",9],["X",10],["XL",40],["L",50],["XC",90],["C",100],["CD",400],["D",500],["CM",900],["M",1000]]

        
        ans=""
        #Come from highest number to lowest, so reverse :)
        for sym,val in reversed(d):
            if num//val:
                count=num//val
                ans += (sym*count)
                num=num%val
        return ans