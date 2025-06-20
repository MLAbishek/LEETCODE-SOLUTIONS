class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        totword=s+s
        n=len(totword)
        m=len(s)
        for i in range(n-m):
            word=totword[i:i+m]
            if word==goal:
                return True
        return False

        