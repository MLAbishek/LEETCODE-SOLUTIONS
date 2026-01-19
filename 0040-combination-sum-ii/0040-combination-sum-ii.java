class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> val = new ArrayList<>();
         int N=candidates.length;
         helper(0,target,ans,val,N,candidates);
         return ans;
    }
    private static void helper(int ind,int target,List<List<Integer>> ans,List<Integer> val,int N,int[] arr){
        if(target==0){
            ans.add(List.copyOf(val));
            return;
        }
        for(int i=ind;i<N;i++){
            if(i>ind && arr[i-1]==arr[i]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            val.add(arr[i]);
            helper(i+1,target-arr[i],ans,val,N,arr);
            val.remove(val.size()-1);
        }
    }
}