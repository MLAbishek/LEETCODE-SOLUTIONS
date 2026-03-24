class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
        }

        for(char c:map.keySet()){
            if(map.get(c)!=0){
                return c;
            }
        }
        return t.charAt(0);
    }
}