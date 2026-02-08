class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+2];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        if(n<=1){
            return dp[n];
        }
        helper(dp,n+1);
        return dp[n+1];
    }
    private static int helper(int[] dp,int n){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(dp,n-1)+helper(dp,n-2);
        return dp[n];
    }
}