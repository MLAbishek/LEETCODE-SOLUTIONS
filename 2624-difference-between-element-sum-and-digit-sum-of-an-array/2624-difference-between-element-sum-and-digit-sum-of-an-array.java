class Solution {
    private static int digitsum(int n){
        int ans=0;
        while(n>0){
            ans+=(n%10);
            n=n/10;
        }
        return ans;
    }
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digsum=0;
        for(int n:nums){
            elesum+=n;
            digsum+=digitsum(n);
        }
        return Math.abs(elesum-digsum);
    }
}