class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxlen=0;
        int count=0;
        for(int val:map.keySet()){
            maxlen=Math.max(map.get(val),maxlen);
        }
        for(int val:map.keySet()){
            if(map.get(val)==maxlen){
                count+=maxlen;
            }
        }
        return count;

    }
}