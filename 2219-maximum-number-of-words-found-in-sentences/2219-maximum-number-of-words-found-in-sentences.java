class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String s:sentences){
            String[] words=s.split(" ");
            count=Math.max(count,words.length);
        }
        return count;
    }
}