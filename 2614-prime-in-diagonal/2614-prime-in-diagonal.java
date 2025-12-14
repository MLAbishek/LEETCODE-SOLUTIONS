class Solution {
    private static boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int primemax=0;
        int R=nums.length;
        int C=nums[0].length;
        for(int i=0;i<R;i++){
            if(prime(nums[i][i])){
                primemax=Math.max(primemax,nums[i][i]);
            }
        }
        for(int r=0,c=C-1;r<R && c>=0;r++,c--){
            if(prime(nums[r][c])){
                primemax=Math.max(primemax,nums[r][c]);
            }
        }
        return primemax;
    }
}