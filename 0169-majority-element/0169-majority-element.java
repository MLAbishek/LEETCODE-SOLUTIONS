class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private static int helper(int[] arr,int left,int right){
        if(left==right){
            return arr[left];
        }
        int mid=(left+right)/2;
        int lmaj=helper(arr,left,mid);
        int rmaj=helper(arr,mid+1,right);
        if(lmaj==rmaj) return lmaj;
        int lcount=count(arr,lmaj,left,mid);
        int rcount=count(arr,rmaj,mid+1,right);
        if(lcount>rcount){
            return lmaj;
        }
        else{
            return rmaj;
        }
    }
    private static int count(int arr[],int val,int l,int r){
        int ans=0;
        for(int i=l;i<=r;i++){
            if(arr[i]==val){
                ans++;
            }
        }
        return ans;
    }
}