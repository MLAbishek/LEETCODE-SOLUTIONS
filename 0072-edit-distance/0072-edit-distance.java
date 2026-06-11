class Solution {
    private static int helper(String word1,String word2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(i<0 && j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return helper(word1,word2,i-1,j-1,dp);
        }
        int insert=1+helper(word1,word2,i,j-1,dp);
        int delete=1+helper(word1,word2,i-1,j,dp);
        int replace=1+helper(word1,word2,i-1,j-1,dp);
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));

    }
    public int minDistance(String word1, String word2) {
        int N=word1.length();
        int M=word2.length();
        int[][] dp = new int[N+1][M+1];
        for(int i=0;i<=N;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
}