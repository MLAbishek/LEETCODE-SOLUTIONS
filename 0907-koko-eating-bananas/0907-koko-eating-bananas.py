import math
class Solution:
    def speed(self,arr,hr):
        ans=0
        for i in range(len(arr)):
            ans+=int(math.ceil(arr[i]/hr))
        return ans
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l=1
        final=float('inf')
        r=max(piles)
        while(l<=r):
            m=(l+r)//2
            minspeed=self.speed(piles,m)
            if(minspeed<=h):
                final=min(final,m)
                r=m-1
            else:
                l=m+1
        return final
        

        