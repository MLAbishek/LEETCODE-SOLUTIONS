class Solution {
    private static int mincoins(int ind,int total,int[] arr,int[][] dp){
        if(ind<0){
            return Integer.MAX_VALUE;
        }
        if(total==0){
            return 0;
        }
        if(dp[ind][total]!=-1){
            return dp[ind][total];
        }
        int take=Integer.MAX_VALUE;
        if(total>=arr[ind]){
            take=mincoins(ind,total-arr[ind],arr,dp);
            if(take!=Integer.MAX_VALUE){
                take=take+1;
            }
        }
        int notake=mincoins(ind-1,total,arr,dp);
        return dp[ind][total]=Math.min(take,notake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        int dp[][] = new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = mincoins(n-1,amount,coins,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}