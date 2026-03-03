class Solution {
    private static int helper(String t1, String t2, int i1, int i2, int[][] dp) {
        if (i1 < 0 || i2 < 0) {
            return 0;
        }
        if (dp[i1][i2] != -1)
            return dp[i1][i2];
        if (t1.charAt(i1) == t2.charAt(i2)) {
            dp[i1][i2] = 1 + helper(t1, t2, i1 - 1, i2 - 1, dp);
            return dp[i1][i2];
        }
        dp[i1][i2] = Math.max(helper(t1, t2, i1 - 1, i2, dp), helper(t1, t2, i1, i2 - 1, dp));
        return dp[i1][i2];

    }

    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length();
        int M = text2.length();
        int dp[][] = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                dp[i][j] = -1;

        return helper(text1, text2, N - 1, M - 1, dp);
    }
}