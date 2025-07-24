class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        totsum=float("-inf")
        cursum=0
        for i in range(len(nums)):
            cursum=max(nums[i],cursum+nums[i])
            totsum=max(totsum,cursum)
        return totsum
        