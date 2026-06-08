class Solution {
    private static int helper(int n,int[] dp){
        if(n<=0){
            if(n==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-2,dp)+helper(n-1,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
        
    }
}