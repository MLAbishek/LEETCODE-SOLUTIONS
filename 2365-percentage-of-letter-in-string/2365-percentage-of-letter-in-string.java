class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int N=s.length();
        for(int i=0;i<N;i++){
            if(s.charAt(i)==letter)
                count++;
        }
        int ans=(count*100)/N;
        
        return ans;
    }
}