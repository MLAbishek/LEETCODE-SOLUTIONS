class Solution:
    def findMedianSortedArrays(self, a: List[int], b: List[int]) -> float:
        n1=len(a)
        n2=len(b)
        if n2<n1:
            return self.findMedianSortedArrays(b,a)
        left=(n1+n2+1)//2
        n=n1+n2
        l=0
        r=n1
        while(l<=r):
            mid1=(l+r)//2
            mid2=left-mid1
            l1=float('-inf')
            l2=float('-inf')
            r1=float('inf')
            r2=float('inf')
            if mid1<n1:
                r1=a[mid1]
            if mid2<n2:
                r2=b[mid2]
            if mid1-1>=0:
                l1=a[mid1-1]
            if mid2-1>=0:
                l2=b[mid2-1]
            if l1<=r2 and l2<=r1:
                if n%2==0:
                    return (max(l1,l2)+min(r1,r2))/2.0
                else:
                    return max(l1,l2)
            elif l1>r2:
                r=mid1-1
            else:
                l=mid1+1
            
            

        

        