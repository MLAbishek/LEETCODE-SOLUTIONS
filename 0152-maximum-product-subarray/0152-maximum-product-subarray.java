class Solution {
    public int maxProduct(int[] nums) {
        int psum=1;
        int ssum=1;
        int N=nums.length;
        int totsum=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(psum==0) psum=1;
            if(ssum==0) ssum=1;
            psum=psum*nums[i];
            ssum=ssum*nums[N-i-1];
            totsum=Math.max(Math.max(psum,ssum),totsum);
        }
        return totsum;
    }
}