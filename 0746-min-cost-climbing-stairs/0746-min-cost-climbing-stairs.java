class Solution {
    private static int helper(int[] arr,int[] dp,int ind){
        if(ind==0 || ind==1){
            return arr[ind];
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int left=helper(arr,dp,ind-1);
        int right=helper(arr,dp,ind-2);
        dp[ind] = arr[ind]+Math.min(left,right);
        return dp[ind];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        helper(cost,dp,n-1);
        return Math.min(dp[n-1],dp[n-2]);
        
    }
}