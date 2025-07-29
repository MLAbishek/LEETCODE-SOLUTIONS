class Solution {
    private static void checker(char[][] grid,int r,int c,int R,int C){
        if(r<0 || c<0 || r>=R || c>=C || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        checker(grid,r+1,c,R,C);
        checker(grid,r,c+1,R,C);
        checker(grid,r-1,c,R,C);
        checker(grid,r,c-1,R,C);
    }
    public int numIslands(char[][] grid) {
        Scanner sc = new Scanner(System.in);
        int R=grid.length;
        int C=grid[0].length;
        int count=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]=='1'){
                    checker(grid,r,c,R,C);
                    count++;
                }
            }
        }
        return count;
    }
}