class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int lim=n-3;
        int mindiff=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=lim;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int diff=Math.abs(sum-target);
                if(diff<mindiff){
                    ans=sum;
                    mindiff=diff;
                }
                if(sum<target){
                    l++;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    return sum;  
                }
            }
        }
        return ans;
    }
}