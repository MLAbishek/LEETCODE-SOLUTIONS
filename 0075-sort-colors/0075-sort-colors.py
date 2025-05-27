class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low=0
        right=len(nums)-1
        mid=0
        while(mid<=right):
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
            
            elif nums[mid]==1:
                mid+=1
            
            else:
                nums[right],nums[mid]=nums[mid],nums[right]
                right-=1


