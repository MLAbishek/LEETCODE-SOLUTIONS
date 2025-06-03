class Solution:
    def checker(self,arr,k,thresold):
        values=0
        splits=1
        for i in range(len(arr)):
            if values+arr[i]<=thresold:
                values+=arr[i]
            else:
                values=arr[i]
                splits+=1
        
        return splits
    def splitArray(self, nums: List[int], k: int) -> int:
        l=max(nums)
        r=sum(nums)

        ans=float('inf')

        while(l<=r):
            mid=(l+r)//2
            if self.checker(nums,k,mid)<=k:
                ans=min(ans,mid)
                r=mid-1
            else:
                l=mid+1
        
        return ans


        