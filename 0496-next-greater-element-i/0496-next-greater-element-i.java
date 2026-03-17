class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int N=nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=N-1;i>=0;i--){
            if(s.isEmpty()){
                
                map.put(nums2[i],-1);
                s.push(nums2[i]);
                nums2[i]=-1;
                
            }
            else if(s.peek()>nums2[i]){
                
                map.put(nums2[i],s.peek());
                s.push(nums2[i]);
                nums2[i]=s.peek();
                

            }
            else{
                while(!s.isEmpty() && s.peek()<nums2[i]){
                    s.pop();
                }
                if(!s.isEmpty()){
                    
                    map.put(nums2[i],s.peek());
                    s.push(nums2[i]);
                    nums2[i]=s.peek();

                    
                }
                else{
                    
                    map.put(nums2[i],-1);
                    s.push(nums2[i]);
                    nums2[i]=-1;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;

    }
}