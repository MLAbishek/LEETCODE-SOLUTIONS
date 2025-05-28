class Solution:
    def toLowerCase(self, s: str) -> str:
        ans=""
        for c in s:
            if ord(c)>=ord('A') and ord(c)<=ord('Z'):
                ans=ans+(chr(ord(c)+32))

            else:
                ans+=c
        return ans