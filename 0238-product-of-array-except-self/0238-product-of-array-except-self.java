class Solution {
    private static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
        int prefix[]=new int[N];
        int postfix[]=new int[N];
        prefix[0]=nums[0];
        for(int i=1;i<N;i++){
            prefix[i]=nums[i]*prefix[i-1];
        }
        postfix[N-1]=nums[N-1];
        for(int j=N-2;j>=0;j--){
            postfix[j]=nums[j]*postfix[j+1];
        }

        int res[]=new int[N];
        res[0]=postfix[1];
        res[N-1]=prefix[N-2];

        for(int i=1;i<N-1;i++){
            res[i]=prefix[i-1]*postfix[i+1];
        }
        return res;
    }
}