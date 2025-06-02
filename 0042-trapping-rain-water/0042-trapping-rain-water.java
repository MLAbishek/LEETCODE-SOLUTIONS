class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int maxleft=height[l];
        int maxright=height[r];
        int ans=0;
        while(l<r){
            if(height[l]<height[r]){
                l++;
                maxleft=Math.max(maxleft,height[l]);
                ans+=maxleft-height[l];
            }
            else{
                r--;
                maxright=Math.max(maxright,height[r]);
                ans+=maxright-height[r];
            }
        }
        return ans;
    }
}