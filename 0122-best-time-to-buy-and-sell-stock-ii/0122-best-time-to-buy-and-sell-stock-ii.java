class Solution {
    public int maxProfit(int[] arr) {
        int N=arr.length;
        int ans=0;
        for(int i=0;i<N-1;i++){
            if(arr[i]<arr[i+1]){
                ans+=(arr[i+1]-arr[i]);
            }
        }
        return ans;
    }
}