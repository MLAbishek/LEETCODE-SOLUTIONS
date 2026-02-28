class Solution:
    def helper(self,arr,l,r):
        while(l<=r):
            arr[l],arr[r]=arr[r],arr[l]
            l+=1
            r-=1
    
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        rem=(len(nums)-k)%len(nums)
        
        self.helper(nums,0,rem-1)
        self.helper(nums,rem,len(nums)-1)
        self.helper(nums,0,len(nums)-1)
        return nums

