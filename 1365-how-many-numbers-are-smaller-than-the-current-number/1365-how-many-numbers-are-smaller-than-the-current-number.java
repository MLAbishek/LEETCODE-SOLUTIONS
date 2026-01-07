class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int N=nums.length;
        int ans[]=new int[N];
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}