class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(map.isEmpty())
            return -1;
        int max=0;
        for(int e:map.keySet()){
            max=Math.max(max,map.get(e));
        }
        for(int e:map.keySet()){
            if(map.get(e)==max){
                return e;
            }
        }
        return -1;
        
    }
}