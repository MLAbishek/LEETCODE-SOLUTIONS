class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] flag1=new int[26];
        int[] flag2=new int[26];
        for(char c:ransomNote.toCharArray()){
            flag1[c-'a']++;
        }
        for(char d:magazine.toCharArray()){
            flag2[d-'a']++;
        }
        for(char e:ransomNote.toCharArray()){
            if(flag1[e-'a']>flag2[e-'a']){
                return false;
            }
        }
        return true;
    }
}