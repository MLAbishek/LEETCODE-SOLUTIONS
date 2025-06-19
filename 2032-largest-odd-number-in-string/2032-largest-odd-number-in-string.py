class Solution:
    def largestOddNumber(self, num: str) -> str:
        index=-1
        for i,char in enumerate(num):
            if(ord(char)%2==1):
                print(ord(char))
                index=i
        if(index==-1):
            return ""
        
        return num[:index+1]
        