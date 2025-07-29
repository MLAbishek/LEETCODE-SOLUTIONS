class Solution {
    private static boolean checker(char[][] board,int r,int c,int R,int C,String word,int index){
        if(r<0 || r>=R || c<0 || c>=C || board[r][c]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        char curr = board[r][c];
        board[r][c]='#';
        int[][] diff = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<4;i++){
            int dr=diff[i][0];
            int dc=diff[i][1];
            int adjr=r+dr;
            int adjc=c+dc;
            boolean found=checker(board,adjr,adjc,R,C,word,index+1);
            if(found){
                return true;
            }

        
        }
        board[r][c]=curr;
        return false;

    }
    public boolean exist(char[][] board, String word) {

        int R=board.length;
        int C=board[0].length;
        int index=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(word.charAt(index)==board[r][c]){
                    boolean found=checker(board,r,c,R,C,word,index);
                    if(found){
                        return true;
                    }
                }
                
            }
        }
        return false;

    }
}