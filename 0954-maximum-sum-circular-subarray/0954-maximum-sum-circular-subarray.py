class Solution:
    def maxSubarraySumCircular(self, arr: List[int]) -> int:
        curmax,curmin=0,0
        totmax,totmin=arr[0],arr[0]
        total=0
        for i in range(len(arr)):
            curmax=max(arr[i],curmax+arr[i])
            curmin=min(arr[i],curmin+arr[i])
            totmax=max(totmax,curmax)
            totmin=min(totmin,curmin)
            total+=arr[i]
        if totmax<0:
            return totmax
        else:
            return max(total-totmin,totmax)   