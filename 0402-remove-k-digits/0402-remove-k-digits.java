class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int N=num.length();
        if(N==k){
            return "0";
        }
        for(int i=0;i<N;i++){
            char dig=num.charAt(i);
            while(!st.isEmpty() && k>0 && ((dig-'0')<(st.peek()-'0'))){
                st.pop();
                k--;
            }
            st.push(dig);
        }
        while(k-- >0){
            st.pop();
        }

        String tempans="";
        while(!st.isEmpty()){
            tempans+=st.pop();
        }
        int i=tempans.length()-1;
        while(i>=0 && tempans.charAt(i)=='0'){
            i--;
        }
        String finalans="";
        while(i>=0){
            finalans+=tempans.charAt(i);
            i--;
        }
        if(finalans.equals("")){
            return "0";
        }
        return finalans;
    }
}