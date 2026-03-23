class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q = new LinkedList<>();
        
        int R=image.length;
        int C=image[0].length;
        boolean visited[][]=new boolean[R][C];
        int origc=image[sr][sc];
        q.add(new int[] {sr,sc});
        visited[sr][sc]=true;
        image[sr][sc]=color;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- >0){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                int diff[][]={{1,0},{0,-1},{-1,0},{0,1}};
                for(int i=0;i<4;i++){
                    int adjr=r+diff[i][0];
                    int adjc=c+diff[i][1];
                    if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && image[adjr][adjc]==origc && !visited[adjr][adjc]){
                        q.add(new int[]{adjr,adjc});
                        image[adjr][adjc]=color;
                        visited[adjr][adjc]=true;
                    }
                }

            }
        }
        return image;
    }
}