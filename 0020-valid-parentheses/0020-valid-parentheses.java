class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map =new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        if(s.length()<=1) return false;
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{'  || c=='['){
                st.add(c);
            }
            else{
                if(!st.isEmpty()){
                    char top=st.peek();
                    if(map.get(top)==c){
                        st.pop();
                    }
                    else{
                        return false;
                    }

                }
                else{
                    return false;
                }
                

            }
        }
        return st.isEmpty();
    }
}