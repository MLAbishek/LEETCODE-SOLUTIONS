class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mindiff=Math.min(mindiff,(Math.abs(arr[i-1]-arr[i])));

        }
        System.out.println(mindiff);
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])==mindiff){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}