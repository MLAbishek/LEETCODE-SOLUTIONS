class Solution {
    // private static int helper(int[] arr,int ind,int[] dp){
    //     if(ind<0){
    //         return 0;
    //     }
    //     if(dp[ind]!=-1){
    //         return dp[ind];
    //     }
    //     int left=helper(arr,ind-1,dp);
    //     int right=arr[ind]+helper(arr,ind-2,dp);
    //     dp[ind] = Math.max(left,right);
    //     return dp[ind];
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        if(n==1 ){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
        
    }
}