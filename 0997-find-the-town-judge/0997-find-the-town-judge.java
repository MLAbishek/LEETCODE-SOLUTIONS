class Solution {
    public int findJudge(int n, int[][] trust) {
        int v1[] = new int[n+1];
        int v2[] = new int[n+1];
        for(int i=0;i<trust.length;i++){
            v1[trust[i][0]]=1;
            v2[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++){
            if(v1[i]==0 && v2[i]==n-1){
                return i;
            }
            
        }
        return -1;
    }
}