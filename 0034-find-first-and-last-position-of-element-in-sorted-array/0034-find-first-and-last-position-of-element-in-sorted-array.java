class Solution {
    public int[] searchRange(int[] nums, int target) {
        //find first and last occurence
        int l1=0;
        int r1=nums.length-1;
        int first=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        while(l1<=r1){
            int mid=(l1+r1)/2;
            if(nums[mid]==target){
                first=Math.min(first,mid);
                r1=mid-1;
            }
            else if(nums[mid]<target){
                l1=mid+1;
            }
            else{
                r1=mid-1;
            }
        }


        int l2=0;
        int r2=nums.length-1;
        while(l2<=r2){
            int mid=(l2+r2)/2;
            if(nums[mid]==target){
                last=Math.max(last,mid);
                l2=mid+1;
            }
            else if(nums[mid]<target){
                l2=mid+1;
            }
            else{
                r2=mid-1;
            }
        }
        if(first==Integer.MAX_VALUE)
            first=-1;
        if(last==Integer.MIN_VALUE)
            last=-1;
        return new int[]{first,last};
    }
}