class Solution {
    private static int help(int n,int[] dp){
        if(dp[n]!=0){
            return dp[n];
        }
        if(n<=1){
            return n;
        }
        dp[n]=help(n-1,dp)+help(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
        int[] dp=new int[n+1];
        return help(n,dp);
    }
}