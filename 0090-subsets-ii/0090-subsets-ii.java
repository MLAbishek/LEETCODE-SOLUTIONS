class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int N=nums.length;
        List<Integer> val=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,val,ans,N,nums);
        List<List<Integer>> riyal=new ArrayList<>();
        for(List<Integer> e:ans){
            riyal.add(e);
        }
        return riyal;

          
    }
    private static void helper(int ind,List<Integer> val,Set<List<Integer>> ans,int N,int[] arr){
        if(ind==N){
            ans.add(List.copyOf(val));
            return;
        }
        val.add(arr[ind]);
        helper(ind+1,val,ans,N,arr);
        val.remove(val.size()-1);
        helper(ind+1,val,ans,N,arr);
    }
}