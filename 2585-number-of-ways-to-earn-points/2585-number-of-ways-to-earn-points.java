class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int mod=1000000007;
        int N=types.length;
        int dp[][] = new int[N+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<=N;i++){
            int count=types[i-1][0];
            int marks=types[i-1][1];

            for(int j=0;j<=target;j++){
                for(int k=0;k<=count;k++){
                    if(j-k*marks>=0){
                        dp[i][j]=(dp[i][j]+dp[i-1][j-k*marks])%mod;
                    }
                    else{
                        break;
                    }
                }
            }
            
        }
        return dp[N][target];
        
    }
}