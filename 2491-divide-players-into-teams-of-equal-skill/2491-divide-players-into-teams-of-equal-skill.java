class Solution {
    public long dividePlayers(int[] arr) {
        Arrays.sort(arr);
        int N=arr.length;
        int ans=arr[0]+arr[N-1];
        int l=1;
        int r=N-2;
        long chem=arr[0]*arr[N-1];
        while(l<r){
            int currans=arr[l]+arr[r];
            if(currans!=ans) return -1;
            chem+=(arr[l]*arr[r]);
            l++;
            r--;
        }
        return chem;
        
    }
}