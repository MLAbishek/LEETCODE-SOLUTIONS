class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        if(nums[r]<target){
            return r+1;
        }
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l++;
            }
            else{
                r--;
            }
        }

        return r;
    }
}