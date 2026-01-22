class Solution {
    public List<List<String>> solveNQueens(int n) {
        int ned[]=new int[2*n-1];
        int swd[]=new int[2*n-1];
        int row[]=new int[n];
        int col[]=new int[n];
        List<List<String>> ans = new ArrayList<>();
        String[][] board = new String[n][n];
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                board[r][c]=".";
            }
        }
        helper(ned,swd,row,col,ans,board,0,n);
        return ans;
    }
    private static void helper(int[] ned,int[] swd,int[] row,int[] col,List<List<String>> ans,String[][] board,int ind,int N){
        if(ind==N){
            List<String> temp=new ArrayList<>();
            for(int r=0;r<N;r++){
                String s="";
                for(int c=0;c<N;c++){
                    s+=board[r][c];
                }
                temp.add(s);

            }
            ans.add(temp);
            return;
        }
        for(int c=0;c<N;c++){
            
            if(ned[ind+c]!=1 && swd[c-ind+N-1]!=1 && row[ind]!=1 && col[c]!=1 && !board[ind][c].equals("Q")){
                ned[ind+c]=1;
                swd[c-ind+N-1]=1;
                row[ind]=1;
                col[c]=1;
                board[ind][c]="Q";
                helper(ned,swd,row,col,ans,board,ind+1,N);
                board[ind][c]=".";
                ned[ind+c]=0;
                swd[c-ind+N-1]=0;
                row[ind]=0;
                col[c]=0;
            }
        }
    }
}