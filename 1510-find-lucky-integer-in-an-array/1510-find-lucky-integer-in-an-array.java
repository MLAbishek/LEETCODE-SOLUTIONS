class Solution {
    public int findLucky(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int n:map.keySet()){
            if(n==map.get(n)){
                return n;
            }
        }
        return -1;
    }
}