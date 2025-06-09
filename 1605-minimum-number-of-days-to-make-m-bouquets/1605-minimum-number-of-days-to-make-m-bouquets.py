import math
class Solution:
    def perfect(self,arr,noboq,noflower,day):
        count=0
        curbloom=0
        for i in range(len(arr)):
            if arr[i]<=day:
                count+=1
            else:
                curbloom+=math.floor(count/noflower)
                count=0
        curbloom+=math.floor(count/noflower)
        
        if curbloom>=noboq:
            return True
        else:
            return False

    def minDays(self, bloom: List[int], m: int, k: int) -> int:
        ans=float('inf')
        if m*k>len(bloom):
            return -1
        l=min(bloom)
        r=max(bloom)
        while(l<=r):
            mid=(l+r)//2
            if self.perfect(bloom,m,k,mid):
                ans=min(ans,mid)
                print(ans)
                r=mid-1
            else:
                l=mid+1

        return ans

                

        
        

        