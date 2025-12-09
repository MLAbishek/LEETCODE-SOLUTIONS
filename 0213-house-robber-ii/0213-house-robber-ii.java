class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        if (N == 1)
            return nums[0];
        if (N == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(helper(0,N-2,nums),helper(1,N-1,nums));
    }

    private static int helper(int s,int e,int[] nums) {
        int N =e-s+1;
        int dp[] = new int[N];
        
        dp[0] = nums[s];
        dp[1] = Math.max(nums[s+1], nums[s]);
        for (int i = 2; i < N; i++) {
            dp[i] = Math.max(dp[i - 1], nums[s+i] + dp[i - 2]);
        }
        return dp[N - 1];
    }
}