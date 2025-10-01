class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int N=nums.length;
        int i=0;
        int j=1;
        while(i<N && j<N ){
            int even=i;
            while(even<N-1 && nums[even]%2!=0){
                even++;
            }
            int temp1=nums[even];
            nums[even]=nums[i];
            nums[i]=temp1;
            i+=2;

            int odd=j;
            while(odd<N-1 && nums[odd]%2==0){
                odd++;
            }
            int temp2=nums[odd];
            nums[odd]=nums[j];
            nums[j]=temp2;
            j+=2;
        }
        return nums;
    }
}