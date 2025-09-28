class Solution {
    public boolean isValidSudoku(char[][] board) {
        // now for rows
        for(int i=0;i<9;i++){
            HashSet<Character> rows=new HashSet<>();
            for(int r=0;r<9;r++){
                if(board[i][r]!='.'){
                    if(rows.contains(board[i][r])){
                        return false;
                    }
                    rows.add(board[i][r]);
                }

            }

        }

        // check col
        for(int j=0;j<9;j++){
            HashSet<Character> cols=new HashSet<>();
            for(int c=0;c<9;c++){
                if(board[c][j]!='.'){
                    if(cols.contains(board[c][j])){
                        return false;
                    }
                    cols.add(board[c][j]);
                }
            }
        }

        // subindex

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> sub=new HashSet<>();
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]!='.'){
                            if(sub.contains(board[r][c])){
                                return false;
                            }
                            sub.add(board[r][c]);
                        }
                    }
                }
            }
        }
        return true;
    }
}