class Solution {
    public int[] findErrorNums(int[] nums) {
        int N=nums.length;
        
        int arr[]=new int[N+1];
        for(int n:nums){
            arr[n]++;
        }
        int ans[]=new int[2];
        for(int i=1;i<=N;i++){
            if(arr[i]==2)
                ans[0]=i;
            if(arr[i]==0)
                ans[1]=i;
        }
        return ans;
    }
}