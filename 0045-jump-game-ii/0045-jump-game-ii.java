class Solution {
    private static int findmin(int ind,int[] arr,int[] dp){
        if(ind>=arr.length-1){
            return  0;
        }
        if(arr[ind]==0){
            return dp[ind]=Integer.MAX_VALUE;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int min=Integer.MAX_VALUE;
        for(int i=ind+1;i<=ind+arr[ind];i++){
            min=Math.min(min,findmin(i,arr,dp));
        }
        if(min==Integer.MAX_VALUE){
            dp[ind] = min;
            return dp[ind];
        }
        dp[ind] = 1+min;
        return dp[ind];
    }
    public int jump(int[] nums) {
        int N=nums.length;
        int dp[] = new int[N];
        Arrays.fill(dp,-1);
        return findmin(0,nums,dp);

    }
}