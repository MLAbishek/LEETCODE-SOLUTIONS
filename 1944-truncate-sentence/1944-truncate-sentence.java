class Solution {
    public String truncateSentence(String s, int k) {
        
        
        String arr[]=s.split(" ");
        int N=arr.length;
        if(N<=k)
            return s;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<k;i++){
            sb.append(" "+arr[i]);
        }
        return sb.toString().strip();
    }
}