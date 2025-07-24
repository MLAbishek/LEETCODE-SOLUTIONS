class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        totsum=float("-inf")
        cursum=0
        for i in range(len(nums)):
            cursum+=nums[i]
            totsum=max(totsum,cursum)
            if(cursum<0):
                cursum=0
        return totsum
        