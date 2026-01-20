class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> ans = new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        int N=digits.length();
        helper(ans,curr,0,N,map,digits);
        return ans;

    }
    private static void helper(List<String> ans,StringBuilder curr,int ind,int N,HashMap<Integer,String> map,String digit){
        if(ind==N){
            ans.add(curr.toString());
            return;
        }
        String s=map.get(Character.getNumericValue(digit.charAt(ind)));
        for(int i=0;i<s.length();i++){
            curr.append(s.charAt(i));
            helper(ans,curr,ind+1,N,map,digit);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}