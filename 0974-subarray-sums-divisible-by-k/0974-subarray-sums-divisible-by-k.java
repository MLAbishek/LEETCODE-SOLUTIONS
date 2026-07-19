class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cursum = 0;
        int n = nums.length;
        int ans=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            int rem = cursum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                ans+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}