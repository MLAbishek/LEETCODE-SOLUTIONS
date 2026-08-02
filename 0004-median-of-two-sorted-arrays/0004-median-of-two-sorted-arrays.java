class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        if(n2<n1){
            return findMedianSortedArrays(nums2,nums1);
        }
        int split=(n1+n2+1)/2; // half split required to find median
        int l=0;
        int r=n1;
        while(l<=r){
            int mid1=(l+r)/2;
            int mid2=split-mid1;
            int l1 = (mid1>0) ? nums1[mid1-1]:Integer.MIN_VALUE;
            int r1 = (mid1<n1) ? nums1[mid1]:Integer.MAX_VALUE;
            int l2 = (mid2>0) ? nums2[mid2-1]:Integer.MIN_VALUE;
            int r2 = (mid2<n2) ? nums2[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                else return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2){
                r=mid1-1;
            }
            else{
                l=mid1+1;
            }

        }
        return 0;
    }
}