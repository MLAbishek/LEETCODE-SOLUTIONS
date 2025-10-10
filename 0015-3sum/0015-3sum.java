class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int l=i+1,r=n-1;
            if(i!=0 && nums[i-1]==nums[i]) continue;
            while(l<r){
                int threesum=nums[i]+nums[l]+nums[r];
                if(threesum>0){
                    r--;
                }
                else if(threesum<0){
                    l++;
                }
                else{
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    while(nums[l-1]==nums[l] && l<r){
                        l++;
                    }
                }
            }   
        }

        return ans;
    }
}