class Solution {
    private static int help(int n,int[] dp,int[] cost){
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==cost.length){
            dp[n]=Math.min(help(n-1,dp,cost),help(n-2,dp,cost));
            return dp[n];
        }
        dp[n]=cost[n]+Math.min(help(n-1,dp,cost),help(n-2,dp,cost));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        return help(n,dp,cost);
        
        
    }
}