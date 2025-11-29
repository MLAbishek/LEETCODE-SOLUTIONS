class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int N=nums.length;
        for(int i=0;i<N;i++){
            sum+=nums[i];

        }
        return sum%k;
    }
}