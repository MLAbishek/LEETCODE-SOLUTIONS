class Solution {
    private static int req(int[] arr,int ind,int total,int[][] dp){
        if(ind<0){
            return 0;
        }
        if(total==0){
            return 1;
        }
        if(dp[ind][total]!=-1){
            return dp[ind][total];
        }
        int pick=0;
        if(arr[ind]<=total){
            pick=req(arr,ind,total-arr[ind],dp);
        }
        int nopick=req(arr,ind-1,total,dp);
        dp[ind][total] = pick+nopick;
        return dp[ind][total];
    }
    public int change(int amount, int[] coins) {
        int N=coins.length;
        
        int dp[][] = new int[N+1][amount+1];
        for(int i=0;i<=N;i++){
            Arrays.fill(dp[i],-1);
        }
        return req(coins,N-1,amount,dp);
    }
}