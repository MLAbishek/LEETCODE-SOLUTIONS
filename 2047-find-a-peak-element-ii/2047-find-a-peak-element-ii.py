class Solution:
    def findmaxelement(self,arr,colindex,rowlength):
        ans=0
        ind=0
        for i in range(rowlength):
            if arr[i][colindex]>ans:
                ans=arr[i][colindex]
                ind=i
        return ind



    def findPeakGrid(self, mat: List[List[int]]) -> List[int]:
        R=len(mat)
        C=len(mat[0])
        l=0
        r=C-1
        while(l<=r):
            mid=(l+r)//2
            index=self.findmaxelement(mat,mid,R)
            current=mat[index][mid]
            if mid-1>=0:
                left=mat[index][mid-1]
            else:
                left=-1
            if mid+1<C:
                right=mat[index][mid+1]
            else:
                right=-1
            
            if left<current and right<current:
                return [index,mid]
            elif left>current:
                r=mid-1
            else:
                l=mid+1
        return [-1,-1]

        