class Solution {
    public int findMinArrowShots(int[][] point) {
        int arrow=1;
        Arrays.sort(point,(a,b)->Integer.compare(a[1],b[1]));
        int endt=point[0][1];
        for(int i=1;i<point.length;i++){
            if(point[i][0]<=endt){
                
                continue;
            }
            else{
                arrow++;
                endt=point[i][1];
            }
            
            
        }
        return arrow;
    }
}