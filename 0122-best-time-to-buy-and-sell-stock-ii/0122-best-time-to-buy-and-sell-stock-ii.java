class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=1;
        int ans=0;
        while(r<n){
            if(arr[l]>=arr[r]){
                l=r;
                r++;
            }
            else{
                ans+=(arr[r]-arr[l]);
                l++;
                r++;
            }
        }
        return ans;
    }
}