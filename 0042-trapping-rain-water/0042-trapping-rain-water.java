class Solution {
    public int trap(int[] arr) {
        int total=0;
        int N=arr.length;
        int prefix[]=new int[N];
        prefix[0]=arr[0];
        for(int i=1;i<N;i++){
            prefix[i]=Math.max(arr[i],prefix[i-1]);
        }
        
        int postfix[]=new int[N];
        postfix[N-1]=arr[N-1];
        for(int i=N-2;i>=0;i--){
            postfix[i]=Math.max(arr[i],postfix[i+1]);
        }

        for(int i=0;i<N-1;i++){
            int lmax=prefix[i];
            int rmax=postfix[i];
            if(lmax>arr[i] && rmax>arr[i]){
                total+=Math.min(lmax,rmax)-arr[i];
            }
        }
        return total;
    }
}