class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        arr=sorted(nums1+nums2)
        n=len(arr)
        if n&1:

            l=0
            r=n
            mid=(l+r)//2
            print(mid)
            return arr[mid]
        else:
            l=0
            r=n
            mid=(l+r)//2
            n1=arr[mid]
            n2=arr[mid-1]
            ans=(n1+n2)/2
            return ans

        

        