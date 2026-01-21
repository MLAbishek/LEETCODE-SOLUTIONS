class Solution {
    public List<List<String>> partition(String s) {
        int N=s.length();
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        helper(0,ans,curr,N,s);
        return ans;
    }
    private static void helper(int index,List<List<String>> ans,List<String> curr,int N,String s){
        if(index==N){
            ans.add(List.copyOf(curr));
            return;
        }
        for(int i=index;i<N;i++){
            if(isPalindrome(index,i+1,s)){
                
                curr.add(s.substring(index,i+1));
                
                
                helper(i+1,ans,curr,N,s);
                curr.remove(curr.size()-1);
            }
        }
    }
    private static boolean isPalindrome(int st,int e,String s){
        e=e-1;
        while(st<=e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}