class Solution {
    private static int memo(int n,int[] dp,int[] arr){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= Math.max(arr[n]+memo(n-2,dp,arr),memo(n-1,dp,arr));
        return dp[n];


    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        
        dp[0]=nums[0];
        if(n==1){
            return dp[0];
        }
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=-1;
        }
        return memo(n-1,dp,nums);

    }
}