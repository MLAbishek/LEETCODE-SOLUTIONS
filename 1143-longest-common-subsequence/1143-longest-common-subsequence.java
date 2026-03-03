class Solution {


    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length();
        int M = text2.length();
        int dp[][] = new int[N+1][M+1];

       
        for(int ind1=1;ind1<=N;ind1++){
            for(int ind2=1;ind2<=M;ind2++){
                if(text1.charAt(ind1-1)==text2.charAt(ind2-1)){
                    dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                }
                else{
                    dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }
            }
        }
        return dp[N][M];
    }
}