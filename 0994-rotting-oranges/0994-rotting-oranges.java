class Solution {
    private static int BFS(int R,int C,int[][] grid,int fresh,Queue<int[]> q){
        int days=0;
        while(!q.isEmpty() && fresh>0){
            int[][] diff={{1,0},{0,1},{-1,0},{0,-1}};
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] co=q.poll();
                int r=co[0];
                int c=co[1];
                for(int d=0;d<4;d++){
                    int adjr=r+diff[d][0];
                    int adjc=c+diff[d][1];
                    if(adjr<R && adjr>=0 && adjc<C && adjc>=0 && grid[adjr][adjc]==1){
                        q.add(new int[]{adjr,adjc});
                        grid[adjr][adjc]=2;
                        fresh--;
                        
                    }
                }

            }
            days++;
        }
        if(fresh!=0){
            return -1;
        }
        return days;
    } 
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int R=grid.length;
        int C=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    fresh++;
                }
                if(grid[r][c]==2){
                    q.add(new int[]{r,c});
                }
            }
        }
        return BFS(R,C,grid,fresh,q);
    }
}