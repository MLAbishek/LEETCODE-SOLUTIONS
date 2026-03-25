class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int lim=nums.length-3;
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=lim;i++){
            while(i!=0 && i<=lim && nums[i-1]==nums[i]){
                i++;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                while(i!=l-1  && l<r && nums[l-1]==nums[l]){
                    l++;
                }
                while(r!=n-1  &&  l<r && nums[r]==nums[r+1]){
                    r--;
                }
                if(l>=r){
                    continue;
                }
                if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }
                else{
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    ans.add(li);
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}