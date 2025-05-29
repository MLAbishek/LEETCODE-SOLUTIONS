class Solution:
    def checker(self,arr,threshold,load):
        curweight=0
        curdays=1
        for i in range(len(arr)):
            if curdays>threshold:
                break
            if curweight+arr[i]>load:
                curdays+=1
                curweight=arr[i]

            else:
                curweight+=arr[i]

        
        if curdays<=threshold:
            print(curdays,load)
            return True
        else:
            return False
        
        
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        ans=float('inf')
        l=max(weights)
        r=sum(weights)
        while(l<=r):
            mid=(l+r)//2
            if self.checker(weights,days,mid):
                ans=min(ans,mid)
                r=mid-1
            else:
                l=mid+1
        
        return ans
    
        