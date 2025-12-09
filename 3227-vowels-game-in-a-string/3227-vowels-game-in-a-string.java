class Solution {
    private static boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public boolean doesAliceWin(String s) {
        int count=0;
        for(char c:s.toCharArray()){
            if(vowel(c)){
                return true;
            }
        }

        return false;
    }
}