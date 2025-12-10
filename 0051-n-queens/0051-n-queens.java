class Solution {
    private static boolean safe(int r,int c,int R,int C,String[][] board){
        for(int r1=r-1;r1>=0;r1--){
            if(board[r1][c].equals("Q")){
                return false;
            }
        }
        for(int r1=r-1, c1=c-1;r1>=0 && c1>=0 ;r1--,c1--){
            if(board[r1][c1].equals("Q")){
                return false;
            }
        }
        for(int r1=r-1,c1=c+1;r1>=0 && c1<C;r1--,c1++){
            if(board[r1][c1].equals("Q")){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        int R=n;
        int C=n;
        String[][] board=new String[R][C];
        for(int i=0;i<R;i++)
            for(int j=0;j<C;j++)
                board[i][j]=".";
        List<List<String>> ans=new ArrayList<>();
        helper(0,R,C,board,ans);
        return ans;

    }
    private static void helper(int r,int R,int C,String[][] board,List<List<String>> ans){
        if(r==R){
            List<String> rows=new ArrayList<>();
            for(int i=0;i<R;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<C;j++){
                    sb.append(board[i][j]);
                }
                rows.add(sb.toString());
            }
            ans.add(rows);
            return;
        }
        for(int c=0;c<C;c++){
            if(safe(r,c,R,C,board)){
                board[r][c]="Q";
                helper(r+1,R,C,board,ans);
                board[r][c]=".";
            }
        }

    }
}