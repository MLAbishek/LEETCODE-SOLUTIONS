class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int N=arr.length;
        int l=1;
        int r=arr[N-1];
        int ans = Integer.MIN_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(canPlace(arr,m,mid)){
                ans=Math.max(ans,mid);
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    private static boolean canPlace(int[] arr,int balls,int force){
        int curballs=1;
        int lastb = 0;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[lastb])>=force){
                curballs++;
                lastb=i;
            }
            if(curballs==balls) return true;

        }
        return false;
    }
}