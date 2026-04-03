class Solution {
    private static int helper(StringBuilder sb,int ind,int count,int[][] dp){
        if(ind==sb.length()){
            if(count==0){
                return 1;
            }
            return 0;
        }
        if(count<0){
            return 0;
        }
        if(dp[ind][count]!=-1){
            return dp[ind][count];
        }
        if(sb.charAt(ind)=='*'){
            sb.setCharAt(ind,'(');
            if(helper(sb,ind+1,count+1,dp)==1){
                sb.setCharAt(ind,'*');
                dp[ind][count]=1;
                return dp[ind][count];
            }
            sb.setCharAt(ind,')');
            if(helper(sb,ind+1,count-1,dp)==1){
                sb.setCharAt(ind,'*');
                dp[ind][count]=1;
                return dp[ind][count];
            }
            sb.setCharAt(ind,'*');
            if(helper(sb,ind+1,count,dp)==1){
                dp[ind][count]=1;
                return dp[ind][count];
            }
            return dp[ind][count]=0;
        }
        int ans=0;
        if(sb.charAt(ind)=='('){
            ans = helper(sb,ind+1,count+1,dp);
        }
        if(sb.charAt(ind)==')'){
            ans = helper(sb,ind+1,count-1,dp);
        }
        dp[ind][count]=ans;
        return dp[ind][count];
    }
    public boolean checkValidString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int N=sb.length();
        int dp[][] = new int[N][N+1];
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(sb,0,0,dp)==1;
    }
}