class Solution {
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        int index=0;
        boolean visit[][]=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(board[r][c]==word.charAt(0)){
                    boolean ans=isValid(r,c,R,C,board,word,0,visit);
                    if(ans)
                        return true;
                }
            }
        }
        return false;
    }
    private static boolean isValid(int r,int c,int R,int C, char[][] board,String word,int index,boolean[][] visit){
        if(index==word.length()-1 && word.charAt(index)==board[r][c]){
            return true;
        }
        if(board[r][c]==word.charAt(index)){
            int[][] diff={{1,0},{0,-1},{-1,0},{0,1}};
            visit[r][c]=true;
            for(int i=0;i<4;i++){
                int adjr=r+diff[i][0];
                int adjc=c+diff[i][1];
                if(adjr>=0 && adjc>=0 && adjr<R && adjc<C && !visit[adjr][adjc]){
                    boolean flag=isValid(adjr,adjc,R,C,board,word,index+1,visit);
                    if(flag)
                        return true;
                }
            }
            visit[r][c]=false;
            return false;
        }
        return false;
    }
}