class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowf = new int[9];
        int[] colf = new int[9];
        int[] subf = new int[9];
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.'){
                    int subind=3*(row/3)+(col/3);
                    int dig= board[row][col]-'0';
                    if((rowf[row] & 1<<dig)!=0 || (colf[col] & 1<<dig)!=0 || (subf[subind] & 1<<dig)!=0){
                        return false;
                    }
                    else{
                        rowf[row]|=(1<<dig);
                        colf[col]|=(1<<dig);
                        subf[subind]|=(1<<dig);
                    }
                }
                
            }
        }
        return true;
    }
}