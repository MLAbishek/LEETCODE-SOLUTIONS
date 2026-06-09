class Solution {
    private static int findcost(int[] day,int[] cost,int i,int N,int[] dp){
        if(i>=N){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneday=cost[0]+findcost(day,cost,i+1,N,dp);
        int j=i;
        while(j<N && day[j]<day[i]+7){
            j++;
        }
        int sevenday=cost[1]+findcost(day,cost,j,N,dp);
        int k;
        k=i;
        while(k<N && day[k]<day[i]+30){
            k++;
        }
        int thirtyday=cost[2]+findcost(day,cost,k,N,dp);
        return dp[i]=Math.min(oneday,Math.min(sevenday,thirtyday));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int lastday=0;
        for(int i=0;i<days.length;i++){
            lastday=Math.max(lastday,days[i]);
        }
        int dp[] = new int[days.length+1];
        Arrays.fill(dp,-1);
        return findcost(days,costs,0,days.length,dp);
    }
}