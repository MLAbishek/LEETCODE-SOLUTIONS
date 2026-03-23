class Solution {
    private static void bfs(int r,int c,int R,int C,char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {r,c});
        int diff[][]={{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- >0){
                int top[]=q.poll();
                int row=top[0];
                int col=top[1];
                for(int i=0;i<4;i++){
                    int adjr=row+diff[i][0];
                    int adjc=col+diff[i][1];
                    if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && grid[adjr][adjc]=='1'){
                        q.add(new int[]{adjr,adjc});
                        grid[adjr][adjc]='0';
                    }
                }
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
                    bfs(r,c,R,C,grid);
                }
            }
        }
        return count;

    }
}