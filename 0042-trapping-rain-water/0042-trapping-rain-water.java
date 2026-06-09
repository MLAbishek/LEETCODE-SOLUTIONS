class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxl=height[l];
        int maxr=height[r];
        int ans=0;
        while(l<r){
            if(height[l]<height[r]){
                maxl=Math.max(height[l],maxl);
                ans+=(maxl-height[l]);
                l++;
            }
            else{
                maxr=Math.max(height[r],maxr);
                ans+=(maxr-height[r]);
                r--;
            }
        }
        return ans;
    }
}