class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int[][] dp = new int[R][C];
        for(int i=0;i<R;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(R-1,C-1,grid,dp);
    }
    private static int path(int r,int c,int[][] mat,int[][] dp){
        if(r<0 || c<0){
            return Integer.MAX_VALUE;
        }
        if(r==0 && c==0){
            return mat[0][0];
        }

        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int up=path(r-1,c,mat,dp);
        int left=path(r,c-1,mat,dp);
        return dp[r][c]=mat[r][c]+Math.min(up,left);
    }
}