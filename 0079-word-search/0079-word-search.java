class Solution {
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        boolean visited[][]=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(word.charAt(0)==board[r][c]){
                    if(search(r,c,R,C,board,word,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static boolean search(int s,int e,int R,int C,char[][] board,String word,int index,boolean[][] visited){
        if(index==word.length()-1 && word.charAt(index)==board[s][e]){
            return true;
        }
        visited[s][e]=true;
        int diff[][]={{1,0},{0,-1},{-1,0},{0,1}};
        for(int i=0;i<4;i++){
            int adjr=diff[i][0]+s;
            int adjc=diff[i][1]+e;
            if(adjr>=0 && adjr<R && adjc>=0 && adjc<C && !visited[adjr][adjc] && board[adjr][adjc]==word.charAt(index+1)){
                if(search(adjr,adjc,R,C,board,word,index+1,visited)){
                    return true;
                }
            }
        }
        visited[s][e]=false;
        return false;

    }
}