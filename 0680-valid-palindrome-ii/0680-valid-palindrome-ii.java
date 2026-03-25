class Solution {
    private static boolean check(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        boolean skip=false;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return check(s,l+1,r) || check(s,l,r-1);
            }
            else{
                l++;
                r--;
            }



        }
        return true;
    }
}