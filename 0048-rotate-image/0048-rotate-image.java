class Solution {
    public void rotate(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int dig=0;dig<R;dig++){
            for(int i=dig;i<C;i++){
                int temp=matrix[dig][i];
                matrix[dig][i]=matrix[i][dig];
                matrix[i][dig]=temp;
            }
        }
        for(int r=0;r<R;r++){
            int left=0;
            int right=C-1;
            while(left<=right){
                int temp=matrix[r][left];
                matrix[r][left]=matrix[r][right];
                matrix[r][right]=temp;
                left++;
                right--;
            }
        }
    }
}