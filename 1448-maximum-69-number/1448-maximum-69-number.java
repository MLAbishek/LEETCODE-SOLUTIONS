class Solution {
    public int maximum69Number (int num) {
        String digit=String.valueOf(num);
        StringBuilder sb =  new StringBuilder(digit);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                return Integer.parseInt(sb.toString());
            }
        }
        return num;
        
    }
}