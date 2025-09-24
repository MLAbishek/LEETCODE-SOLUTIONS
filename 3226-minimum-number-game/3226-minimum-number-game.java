class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i:nums){
            heap.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        while(!heap.isEmpty()){
            int alice=heap.poll();
            int bob=heap.poll();
            arr.add(bob);
            arr.add(alice);
            

        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}