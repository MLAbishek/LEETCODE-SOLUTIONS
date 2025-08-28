class Solution {
    public int maxSubArray(int[] nums) {
        int cursum,totsum;
        cursum=0;
        totsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum=Math.max(nums[i],cursum+nums[i]);
            totsum=Math.max(totsum,cursum);
        }
        return totsum;
    }
}