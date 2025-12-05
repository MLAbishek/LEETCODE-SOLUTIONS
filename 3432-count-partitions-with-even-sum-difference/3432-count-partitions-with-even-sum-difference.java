class Solution {
    public int countPartitions(int[] nums) {
        int N=nums.length;
        int[] pre=new int[N];
        int[] post=new int[N];
        pre[0]=nums[0];
        post[N-1]=nums[N-1];
        for(int i=1;i<N;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int j=N-2;j>=0;j--){
            post[j]=post[j+1]+nums[j];
        }
        int count=0;
        for(int i=0;i<N-1;i++){
            int sum=Math.abs(pre[i]-post[i+1]);
            if(sum%2==0)
                count++;
        }
        return count;
    }
}