class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int arr[]:accounts){
            int tot=0;
            for(int num:arr){
                tot+=num;
            }
            ans=Math.max(ans,tot);
        }
        return ans;
    }
}