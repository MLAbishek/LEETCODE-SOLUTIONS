class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int ans=0;
        while(l<r){
            int val=(r-l)*Math.min(arr[l],arr[r]);
            ans=Math.max(ans,val);
            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}