class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int[][] dp = new int[R][C];
        for(int i=0;i<R;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(R-1,C-1,mat,dp);
    }
    private static int helper(int r,int c,int[][] mat,int[][] dp){
        if(r<0 || c<0){
            return 0;
        }
        if(mat[r][c]==1){
            return 0;
        }
        if(r==0 && c==0){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        
        int up=helper(r-1,c,mat,dp);
        int left=helper(r,c-1,mat,dp);
        return dp[r][c]=up+left;
    }
}