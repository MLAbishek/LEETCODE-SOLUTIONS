class Solution {
    private static void helper(int r,int c,int R,int C,char[][] mat,boolean[][] visited){
        visited[r][c]=true;
        mat[r][c]='.';
        int diff[][]={{1,0},{0,-1},{-1,0},{0,1}};
        for(int i=0;i<4;i++){
            int adjr=r+diff[i][0];
            int adjc=c+diff[i][1];
            if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && !visited[adjr][adjc] && mat[adjr][adjc]=='X'){
                helper(adjr,adjc,R,C,mat,visited);
            }
        }
    }
    public int countBattleships(char[][] board) {
        int R=board.length;
        int C=board[0].length;
        boolean visited[][]=new boolean[R][C];
        int count=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(board[r][c]=='X' && !visited[r][c]){
                    helper(r,c,R,C,board,visited);
                    count++;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
            
        return count;
    }
}