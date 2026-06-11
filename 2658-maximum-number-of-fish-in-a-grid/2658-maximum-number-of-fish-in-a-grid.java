class Solution {
    private static int find(int[][] grid , int r,int c, int R,int C,boolean[][] visited){
        int[][] diff={{0,1},{1,0},{0,-1},{-1,0}};
        int ans=grid[r][c];
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int adjr=r+diff[i][0];
            int adjc=c+diff[i][1];
            if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && !visited[adjr][adjc] && grid[adjr][adjc]>0){
                ans+=find(grid,adjr,adjc,R,C,visited);
            }
            
        }
        return ans;
    }
    public int findMaxFish(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        boolean[][] visited = new boolean[R][C];
        int ans=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]>0 && !visited[r][c]){
                    ans=Math.max(ans,find(grid,r,c,R,C,visited));
                }
            }
        }
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(visited[r][c]+" ");
            }
            System.out.println();
        }
        return ans;
    }
}