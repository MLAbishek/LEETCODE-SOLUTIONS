class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2!=0){
                int j=i;
                while(j<nums.length-1 && nums[j]%2!=0){
                    j++;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}