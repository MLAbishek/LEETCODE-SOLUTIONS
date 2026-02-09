class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[nums2.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.add(nums2[i]);
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=ans[map.get(nums1[i])];
        }
        return nums1;
    }
}