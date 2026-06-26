class Solution {
    private static long possible(int[] arr, int m,int k,int day){
        int count=0;
        long no_boquet = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                no_boquet+=(count/k);
                count=0;
            }
            
            
        }
        no_boquet+=(count/k);
        return no_boquet;
    }
    public int minDays(int[] arr, int m, int k) {
        // k == adjacent flowers to pick
        // m == No of boquets to achieve
        int N=arr.length;
        long val = (long)(m*k);
        if(val>N) return -1;
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int num:arr){
            r=Math.max(r,num);
        }
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(possible(arr,m,k,mid) >= m){
                ans=Math.min(ans,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}