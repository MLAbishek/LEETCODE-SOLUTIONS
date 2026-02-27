class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        Arrays.sort(coins);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            int curramt=i;
            int count=Integer.MAX_VALUE;
            for(int ch:coins){
                
                if(curramt>=ch && dp[curramt - ch] != Integer.MAX_VALUE){
                    count=Math.min(count,dp[curramt-ch]);
                }
                
            }
            if (count != Integer.MAX_VALUE)
                dp[i] = count + 1;

        }
        for(int i:dp){
            System.out.print(i+" ");
        }
        if(dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];



    }
}