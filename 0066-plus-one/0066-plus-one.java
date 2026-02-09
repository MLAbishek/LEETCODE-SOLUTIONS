class Solution {
    public int[] plusOne(int[] nums) {
        int N=nums.length;
        if(nums[N-1]+1<=9){
            nums[N-1]++;
            return nums;
        }
        else{
            int carry=(nums[N-1]+1)/10;

            for(int i=N-1;i>=0;i--){
                int sum=nums[i]+carry;
                if(sum>=10){
                    carry=sum/10;
                    nums[i]=sum%10;
                }
                else{
                    nums[i]+=carry;
                    carry=0;
                    break;
                }
            }
            if(carry!=0){
                int newans[]=new int[N+1];
                newans[0]=carry;
                newans[1]=nums[0]%10;
                for(int i=2;i<=N;i++){
                    newans[i]=nums[i-1];
                }
                return newans;
            }
            return nums;
        }
    }
}