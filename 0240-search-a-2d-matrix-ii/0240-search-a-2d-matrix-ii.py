class Solution:
    def checkpresence(self,arr,r1,c1,R,C,target):
        if(r1>=0 and r1<R and c1>=0 and c1<C):
            #row
            l=c1
            r=C-1
            while(l<=r):
                mid=(l+r)//2
                if arr[r1][mid]==target:
                    return True
                elif target<arr[r1][mid]:
                    r=mid-1
                else:
                    l=mid+1
            #col
            l=r1
            r=R-1
            while(l<=r):
                mid=(l+r)//2
                if arr[mid][c1]==target:
                    return True
                elif target<arr[mid][c1]:
                    r=mid-1
                else:
                    l=mid+1
            return False

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        R=len(matrix)
        C=len(matrix[0])
        for r in range(R):
            for c in range(C):
                if(matrix[r][c]<=target and target<=matrix[r][C-1] and target<=matrix[R-1][c]):
                    if self.checkpresence(matrix,r,c,R,C,target):
                        return True
        return False    
                
        