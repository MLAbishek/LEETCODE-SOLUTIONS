class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        int dp[]=new int[N];
        if(N==1)
            return nums[0];
        if(N==2)
            return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<N;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[N-1];
    }
}