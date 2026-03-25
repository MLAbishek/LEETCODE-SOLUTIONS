class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int lim1=n-3;
        int lim2=n-2;
        for(int i=0;i<lim1;i++){
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<lim2;j++){
                if(j!=i+1 && nums[j-1]==nums[j]){
                    continue;
                }
                int l=j+1;
                int r=n-1;
                while(l<r){
                    while(l!=j+1 && l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                    while(r!=n-1 && l<r && nums[r+1]==nums[r]){
                        r--;
                    }
                    if(l>=r){
                        continue;

                    }
                    int a=nums[i];
                    int b=nums[j];
                    int c=nums[l];
                    int d=nums[r];
                    long sum=a+b;
                    sum+=c;
                    sum+=d;
                    if(sum==target){
                        ans.add(Arrays.asList(a,b,c,d));
                        l++;
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}