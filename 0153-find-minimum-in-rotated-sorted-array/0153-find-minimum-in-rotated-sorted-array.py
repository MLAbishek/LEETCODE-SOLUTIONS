class Solution:
    def findMin(self, arr: List[int]) -> int:
        l=0
        r=len(arr)-1
        if len(arr)==1:
            return arr[0]
        
        ans=float('inf')
        while(l<=r):
            m=(l+r)//2
            if arr[l]<arr[m]:
                ans=min([arr[l],arr[m],ans])
                l=m+1
            else:
                if arr[m]<arr[r]:
                    ans=min(arr[m],ans)
                    r=m-1
                else:
                    ans=min(arr[r],ans)
                    l=m+1
        return ans

            