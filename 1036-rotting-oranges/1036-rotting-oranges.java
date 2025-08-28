class Solution {
    private static int days(int R,int C,int fresh,int[][] grid,Queue<int[]> queue){
        int days=0;
        int diff[][]={{0,1},{1,0},{0,-1},{-1,0}};
        boolean visited[][]=new boolean[R][C];
        while(!queue.isEmpty() && fresh>0){
            int size=queue.size();
            
            for(int ind=0;ind<size;ind++){
                int[] curpos=queue.poll();
                int r=curpos[0];
                int c=curpos[1];
                for(int i=0;i<4;i++){
                    
                    int adjr=r+diff[i][0];
                    int adjc=c+diff[i][1];
                    if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && !visited[adjr][adjc] && grid[adjr][adjc]==1){
                        queue.add(new int[]{adjr,adjc});
                        grid[adjr][adjc]=2;
                        visited[adjr][adjc]=true;
                        fresh--;
                    }
                }
            }
            days++;
        }
        if(fresh==0){
            return days;
        }
        else{
            return -1;
        }


    }
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int fresh=0;
        int srow=0;
        int scol=0;
        Queue<int[]> queue=new LinkedList<>();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    fresh++;
                }
                if(grid[r][c]==2){
                    queue.add(new int[]{r,c});
                }
            }
        }
        return days(R,C,fresh,grid,queue);

    }
}