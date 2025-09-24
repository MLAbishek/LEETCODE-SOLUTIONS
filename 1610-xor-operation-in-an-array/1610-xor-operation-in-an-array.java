class Solution {
    public int xorOperation(int n, int start) {
        int ans=start;
        for(int i=0;i<n-1;i++){
            ans=ans^start+2;
            start=start+2;
        }
        return ans;
    }
}