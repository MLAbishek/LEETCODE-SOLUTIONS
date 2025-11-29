class Solution {
    public int minOperations(int[] nums, int k) {
        long sum=0;
        int N=nums.length;
        for(int i=0;i<N;i++){
            sum+=nums[i];

        }
        int quot=(int)(sum/k);
        int real=quot*k;
        return (int)(sum-real);
    }
}