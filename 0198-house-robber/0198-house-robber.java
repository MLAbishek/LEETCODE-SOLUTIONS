class Solution {
    private static int helper(int[] arr,int ind,int[] dp){
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int left=helper(arr,ind-1,dp);
        int right=arr[ind]+helper(arr,ind-2,dp);
        dp[ind] = Math.max(left,right);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,n-1,dp);
    }
}