class Solution:
    def myAtoi(self, s: str) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        index=0
        ans=0
        n=len(s)
        while(index<n and s[index]==" "):
            index+=1
        if(index==n):
            return 0
        sign=1
        if(s[index]=="-"):
            sign=-1
            index+=1
        elif(s[index]=="+"):
            sign=1
            index+=1

        
        print(index)
        while(index<n and s[index].isdigit()):
            digit=int(s[index])

            if( ans > (INT_MAX - digit ) // 10 ):
                return INT_MAX if sign==1 else INT_MIN
            ans=(ans*10)+int(digit)
            index+=1



        return ans*sign
        
        