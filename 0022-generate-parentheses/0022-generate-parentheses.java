class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        helper("(",ans,1,0,n);
        return ans;
    }
    private static void helper(String s,ArrayList<String> ans,int open,int close,int n){
        if(open-close<0 || open>n || close>n){
            return;
        }
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        helper(s+")",ans,open,close+1,n);
        helper(s+"(",ans,open+1,close,n);
    }
}