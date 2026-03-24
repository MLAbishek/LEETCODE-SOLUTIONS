class Solution {
    public int twoCitySchedCost(int[][] cost) {
        int n=cost.length;
        int[][] point = new int[n][3];
        for(int i=0;i<n;i++){
            point[i][0]=cost[i][1]-cost[i][0];
            point[i][1]=cost[i][0];
            point[i][2]=cost[i][1];
        }
        Arrays.sort(point,(a,b)->Integer.compare(a[0],b[0]));
        int half=n/2;
        int ans=0;
        for(int i=0;i<half;i++){
            ans+=point[i][2];
        }
        for(int i=half;i<n;i++){
            ans+=point[i][1];
        }
        return ans;
    }
}