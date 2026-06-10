class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int R=triangle.size();
        int C=0;
        for(int r=0;r<R;r++){
            C=Math.max(C,triangle.get(r).size());
            
        }
   
        int[][] dp = new int[R][C];
        for(int r=0;r<R;r++){
            Arrays.fill(dp[r],Integer.MAX_VALUE);
        }
        return path(0,0,R,triangle,dp);

    }
    private static int path(int r,int c,int R,List<List<Integer>> mat,int[][] dp){
        if(r==R){
            return 0;
        }
        if(c >= mat.get(r).size()){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=Integer.MAX_VALUE){
            return dp[r][c];
        }
        int left=path(r+1,c,R,mat,dp);
        int right=path(r+1,c+1,R,mat,dp);
        return dp[r][c]=mat.get(r).get(c)+Math.min(left,right);
    }
}