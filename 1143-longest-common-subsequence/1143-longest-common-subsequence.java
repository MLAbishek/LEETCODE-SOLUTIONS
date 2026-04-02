class Solution {
    private static int lcs(String s1,String s2,int i1,int i2,int[][] dp){
        if(i1==0 || i2==0){
            return 0;
        }
        if(dp[i1][i2]!=-1){
            return dp[i1][i2];
        }
        if(s1.charAt(i1-1)==s2.charAt(i2-1)){
            dp[i1][i2] =  1+lcs(s1,s2,i1-1,i2-1,dp);
            return dp[i1][i2];
        }
        int a=lcs(s1,s2,i1-1,i2,dp);
        int b=lcs(s1,s2,i1,i2-1,dp);
        dp[i1][i2] =  Math.max(a,b);
        return dp[i1][i2];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return lcs(text1,text2,n,m,dp);
        
    }
}