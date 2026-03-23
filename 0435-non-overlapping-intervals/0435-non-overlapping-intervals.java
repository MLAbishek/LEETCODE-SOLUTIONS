class Solution {
    public int eraseOverlapIntervals(int[][] interval) {
        Arrays.sort(interval,(a,b)->a[1]-b[1]);
        int count=0;
        int endtime=interval[0][1];
        int N=interval.length;
        for(int i=1;i<N;i++){
            if(interval[i][0]<endtime){
                count++;
            }
            else{
                endtime=interval[i][1];
            }
        }
        return count;
    }
}