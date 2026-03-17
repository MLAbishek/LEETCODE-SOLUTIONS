class Solution {
    private static int dfs(Queue<int[]> q, boolean[][] visited,int[][] grid,int fresh,int R,int C){
        int days=0;
        
        while(q.size()>0){
            boolean rot=false;
            int qsize=q.size();
            while(qsize-- >0){
                int[] point=q.poll();
                int r=point[0];
                int c=point[1];
                
                int diff[][]={{0,1},{1,0},{-1,0},{0,-1}};
                for(int i=0;i<4;i++){
                    int adjr=diff[i][0]+r;
                    int adjc=diff[i][1]+c;
                    if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && !visited[adjr][adjc] && grid[adjr][adjc]==1){
                        visited[adjr][adjc]=true;
                        grid[adjr][adjc]=2;
                        fresh--;
                        q.add(new int[] {adjr,adjc});
                        rot=true;
                    }


                }
            }
            if(rot)
                days++;

        }
        if(fresh!=0){
            return -1;
        }
        else{
            return days;
        }
    }
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int fresh=0;
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][]=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    fresh++;
                }
                if(grid[r][c]==2){
                    visited[r][c]=true;
                    q.add(new int[] {r,c});
                }
            }
        }
        return dfs(q,visited,grid,fresh,R,C);
        





    }
}