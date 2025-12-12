class Solution {
    public int diagonalSum(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int visited[][]=new int[R][C];

        int d1ans=0;
        for(int i=0;i<R;i++){
            d1ans+=mat[i][i];
            visited[i][i]=1;
        }
        int d2ans=0;
        for(int r1=0,c1=C-1 ; r1<R && c1>=0;r1++,c1--){
            if(visited[r1][c1]!=1){
                d2ans+=mat[r1][c1];
                visited[r1][c1]=1;
            }
        }
        return d1ans+d2ans;
    }
}