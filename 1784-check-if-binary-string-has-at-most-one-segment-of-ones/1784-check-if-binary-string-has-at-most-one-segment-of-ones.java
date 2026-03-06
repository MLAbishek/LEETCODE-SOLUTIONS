class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.charAt(0)=='1'){
            return true;
        }
        int ind=0;
        while(ind<s.length() && s.charAt(ind)=='1'){
            ind++;
        }
        while(ind<s.length()){
            if(s.charAt(ind)=='1'){
                return false;
            }
            ind++;
        }
        
        return true;
    }
}