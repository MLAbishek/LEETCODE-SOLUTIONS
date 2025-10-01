class Solution {
    public int largestAltitude(int[] gain) {
        int N=gain.length;
        int prefix[]=new int[N+1];
        int max=0;
        for(int i=1;i<=N;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
            max=Math.max(prefix[i],max);
        }
        return max;

    }
}