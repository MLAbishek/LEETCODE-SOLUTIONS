class Solution {
    public int climbStairs(int n, int[] cost) {
        if(n==1){
            return cost[0]+1;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=cost[0]+1;
        dp[2]=cost[1]+Math.min(dp[1]+1,dp[0]+4);
        for(int i=3;i<=n;i++){
            
            dp[i]=cost[i-1]+Math.min(dp[i-1]+1,Math.min(dp[i-2]+4,dp[i-3]+9));

        }
        return dp[n];
    }
}