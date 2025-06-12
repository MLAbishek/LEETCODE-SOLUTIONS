class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        ans=[]
        finalans=""
        stack=[s[0]]
        first=0
        last=0
        for i in range(1,len(s)):
            if len(stack)==0:
                last=i-1
                ans.append(s[first:last+1])
                print(s[first:last+1])
                first=i
            if (len(stack)!=0 and stack[-1]=='(' and s[i]==')' ):

                stack.pop()

            else:
                stack.append(s[i])
        if len(stack)==0:
            last=len(s)
            ans.append(s[first:last])
        for i in range(len(ans)):
            finalans+=ans[i][1:-1]
        return finalans


