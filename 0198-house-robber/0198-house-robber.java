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
        // int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        if(n==1 ){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int prev1=nums[0];
        int prev2=Math.max(nums[0],nums[1]);
        int curr=0;
        for(int i=2;i<n;i++){
            curr=Math.max(prev1+nums[i],prev2);
            prev1=prev2;
            prev2=curr;
        }
        return curr;
        
    }
}