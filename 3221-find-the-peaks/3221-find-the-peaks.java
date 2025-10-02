class Solution {
    public List<Integer> findPeaks(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}