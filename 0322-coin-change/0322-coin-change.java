class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[]=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                int change=j-coins[i];
                if(dp[change]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],1+dp[change]);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)return -1;
        return dp[amount];
    }
}