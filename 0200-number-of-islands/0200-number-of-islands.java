class Solution {
    public int numIslands(char[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]=='1' && !visited[r][c]){
                    dfs(r,c,R,C,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int r,int c,int R,int C,char[][]grid, boolean[][] visited){
        if(r<0 || r>=R || c<0 || c>=C  || grid[r][c]=='0' || visited[r][c]){
            return;
        }
       
        visited[r][c]=true;
        int[][] diff={{1,0},{0,-1},{-1,0},{0,1}};
        for(int i=0;i<4;i++){
            int adjr=r+diff[i][0];
            int adjc=c+diff[i][1];
            dfs(adjr,adjc,R,C,grid,visited);

        }
    }
}