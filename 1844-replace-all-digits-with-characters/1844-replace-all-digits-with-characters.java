class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<s.length();i++){
            char curr=sb.charAt(i);
            if(Character.isDigit(curr)){
                char c = (char)(sb.charAt(i-1)+Character.getNumericValue(curr));
                sb.setCharAt(i,c);
            }
        }
        return sb.toString();
    }
}