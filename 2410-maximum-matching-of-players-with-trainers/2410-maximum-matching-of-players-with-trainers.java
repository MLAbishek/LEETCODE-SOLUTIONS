class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        //Players-> p  Trainers -> t
        Arrays.sort(p);
        Arrays.sort(t);
        int l=0;
        int r=0;
        int n=p.length;
        int m=t.length;
        while(l<n && r<m){
            if(p[l]<=t[r]){
                l++;
                r++;
            }
            else{
                r++;
            }

        }
        return l;
    }
}