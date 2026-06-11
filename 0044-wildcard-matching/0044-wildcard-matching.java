class Solution {
    // private static int matcher(String s,String p,int i,int j,int[][] dp){
    //     if(i<0 && j<0){
    //         return 1;
    //     }
    //     if(i<0 && j>=0){
    //         for(int k=0;k<=j;k++){
    //             if(p.charAt(k)!='*'){
    //                 return 0;
    //             }
    //         }
    //         return 1;
    //     }
    //     if(j<0 && i>=0){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
    //         return dp[i][j]=matcher(s,p,i-1,j-1,dp);
    //     }
    //     if(p.charAt(j)=='*'){
    //         if(matcher(s,p,i,j-1,dp)==1 ||  matcher(s,p,i-1,j,dp)==1){
    //             return dp[i][j] = 1;
    //         }
    //         return dp[i][j]=0;
    //     }
    //     return dp[i][j]=0;
    // }
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()+1][p.length()+1];
        for(int i=0;i<=s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        // int ans=matcher(s,p,s.length()-1,p.length()-1,dp);
        // System.out.println(ans);
        // return 1==ans;
        dp[0][0]=1;
        for(int i=1;i<=s.length();i++){
            dp[i][0]=0;
        }
        for(int j=1;j<=p.length();j++){
            boolean flag=true;
            for(int k=1;k<=j;k++){
                if(p.charAt(k-1)!='*'){
                    flag=false;
                }
            }
            if(flag==true){
                dp[0][j]=1;
            }
            else{
                dp[0][j]=0;
            }
        }

        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    if(dp[i][j-1] ==1 ||  dp[i-1][j]==1){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
                else dp[i][j]=0;
            }
        }
        return dp[s.length()][p.length()]==1;

    }
}