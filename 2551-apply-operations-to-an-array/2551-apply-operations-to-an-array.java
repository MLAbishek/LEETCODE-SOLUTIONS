class Solution {
    public int[] applyOperations(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int piv=0;
        for(int i=0;i<N;i++){
            if(nums[i]!=0){
                int temp=nums[piv];
                nums[piv]=nums[i];
                nums[i]=temp;
                piv++;
            }
        }
        return nums;
    }
}