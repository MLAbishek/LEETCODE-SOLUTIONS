import math
class Solution:
    def checker(self,arr,d,thresh):
        totsum=0
        for i in range(len(arr)):
            totsum+=(math.ceil(arr[i]/d))
        
        if totsum<=thresh:
            return True
        else:
            return False
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        ans=float('inf')
        l=1
        r=max(nums)
        while(l<=r):
            mid=(l+r)//2
            if self.checker(nums,mid,threshold):
                ans=min(ans,mid)
                r=mid-1
            else:
                l=mid+1
        return ans

        