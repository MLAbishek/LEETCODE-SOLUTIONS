class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.strip();
        int count=0;
        int index=s.length()-1;
        while(index>=0 && s.charAt(index)==' '){
            index--;
        }
        while(index>=0 && s.charAt(index)!=' '){
            count++;
            index--;
        }
        return count;
    }
}