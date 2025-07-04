class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse1(l,r,nums):
            while(l<r):
                nums[l],nums[r]=nums[r],nums[l]
                l+=1
                r-=1
        
        n=len(nums)
        mid=(n-k)%n
        reverse1(0,mid-1,nums)
        reverse1(mid,n-1,nums)
        reverse1(0,n-1,nums)

        