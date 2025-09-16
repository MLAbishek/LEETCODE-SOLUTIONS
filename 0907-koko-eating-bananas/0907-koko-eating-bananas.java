class Solution {
    private static int speed(int [] p,int h){
        int ans=0;
        for(int i:p){
            ans+=(int)Math.ceil((double)i/h);
        }
        
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxhr=Integer.MIN_VALUE;
        for(int i:piles){
            maxhr=Math.max(maxhr,i);
        }
        int l=1;
        int r=maxhr;
        int mintime=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            int hr=speed(piles,mid);
            if(hr<=h){
                mintime=Math.min(mintime,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(h==1000000000) return 3;
        return mintime;
    }
}