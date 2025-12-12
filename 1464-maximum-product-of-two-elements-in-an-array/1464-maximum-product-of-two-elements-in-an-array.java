class Solution {
    public int maxProduct(int[] nums) {
        long ans=Integer.MIN_VALUE;
        int N=nums.length;
        for(int i=0;i<N-1;i++)
            for(int j=i+1;j<N;j++)
                ans=Math.max(ans,(nums[i]-1) * (nums[j]-1));
        return (int)ans;
    }
}