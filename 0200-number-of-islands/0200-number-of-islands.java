class Solution {
    private static void dfs(int R,int C,int r,int c,char[][] grid){
        grid[r][c]='0';
        int diff[][]={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<4;i++){
            int adjr=diff[i][0]+r;
            int adjc=diff[i][1]+c;
            if( adjr<R && adjc<C && adjr>=0 && adjc>=0 && grid[adjr][adjc]=='1'){
                dfs(R,C,adjr,adjc,grid);
            }
        }

    }
    public int numIslands(char[][] grid) {
        int count=0;
        int R=grid.length;
        int C=grid[0].length;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]=='1'){
                    count++;
                    dfs(R,C,r,c,grid);
                }
            }
        }
        return count;

    }
}