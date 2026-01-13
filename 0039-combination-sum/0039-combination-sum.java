class Solution {
    public List<List<Integer>> combinationSum(int[] valarr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int N=valarr.length;
        helper(0,target,curr,ans,valarr,N);
        return ans;
    }
    private static void helper(int index,int target,List<Integer> curr,List<List<Integer>> ans,int[] valarr,int N){
        if(index==N){
            if(target==0){
                ans.add(List.copyOf(curr));
            }
            return;
        }
        if(target>=valarr[index]){
            curr.add(valarr[index]);
            helper(index,target-valarr[index],curr,ans,valarr,N);
            curr.remove(curr.size()-1);
            
        }
        helper(index+1,target,curr,ans,valarr,N);
    }
}