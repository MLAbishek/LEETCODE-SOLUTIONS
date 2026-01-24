class Solution {
    public void solveSudoku(char[][] board) {
        solve(0,board);
        
    }
    private static boolean solve(int curow,char[][] board){
        for(int r=curow;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    for(int i=1;i<=9;i++){
                        char num=(char)('0'+i);
                        if(valid(r,c,board,num)){
                            board[r][c]=num;
                            if(solve(r,board)){
                                return true;
                            }
                            else{
                                board[r][c]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean valid(int r,int c,char[][] board,char num){
        for(int i=0;i<9;i++){
            if(board[r][i]==num){
                return false;
            }
            if(board[i][c]==num){
                return false;
            }
            if(board[3*(r/3)+(i/3)][3*(c/3)+(i%3)]==num){
                return false;
            }
        }
        return true;
    }
}