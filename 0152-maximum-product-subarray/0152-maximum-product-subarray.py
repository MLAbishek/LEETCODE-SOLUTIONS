class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        totmax=float('-inf')
        curmax=1
        curmin=1
        for i in range(len(nums)):
            temp=curmax*nums[i]
            curmax=max(curmax*nums[i],nums[i],curmin*nums[i])
            curmin=min(temp,nums[i],curmin*nums[i])
            totmax=max(curmax,totmax)
        return totmax
        