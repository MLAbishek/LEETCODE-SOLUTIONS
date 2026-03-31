class Solution {
    private static int check(int val,int ind,int[] coins,int[][] dp){
        if(ind==coins.length){
            if(val==0)
                return 1;
            return 0;
        }
        if(dp[ind][val]!=-1){
            return dp[ind][val];
        }
        int take=0;
        if(coins[ind]<=val){
            take = check(val-coins[ind],ind,coins,dp);
        }
        int notake=check(val,ind+1,coins,dp);
        dp[ind][val] = take+notake;
        return dp[ind][val];
    }
    public int change(int amount, int[] coins) {
        //UNBOUNDED KNAPSACK
        int dp[][] = new int[coins.length+1][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return check(amount,0,coins,dp);

    }
}