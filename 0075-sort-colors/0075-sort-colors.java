class Solution {
    private static void swap(int l,int r,int[] nums){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int r=nums.length-1;
        while(m<=r){
            if(nums[m]==2){
                swap(m,r,nums);
                r--;
            }
            else if(nums[m]==0){
                swap(l,m,nums);
                l++;
                m++;

            }
            else{
                m++;
            }
        }
    }
}