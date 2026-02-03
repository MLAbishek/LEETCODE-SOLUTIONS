class Solution {
    private static boolean isAlphabetic(char c){
        if('a'<=c && c<='z'){
            return true;
        }
        if('A'<=c && c<='Z'){
            return true;
        }
        if('0'<=c && c<='9'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        
        while (l <= r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (!isAlphabetic(left) || !isAlphabetic(right)) {
                if (!isAlphabetic(left)) {
                    l++;
                } else {
                    r--;
                }
            } else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                } else {
                    l++;
                    r--;
                }
            }
        }
        return true;
    }
}