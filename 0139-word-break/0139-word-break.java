class Solution {
    public boolean wordBreak(String s, List<String> word) {
        int N=s.length();
        boolean dp[] = new boolean[N+1];
        dp[N]=true;
        for(int i=N-1;i>=0;i--){
            for(String sen:word){
                int l=sen.length();
                if(i+l<=N && s.substring(i,i+l).equals(sen)){
                    dp[i]=dp[i+l];
                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[0];
    }
}