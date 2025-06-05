class Solution:
    def searchMatrix(self, arr: List[List[int]], target: int) -> bool:
        maxl=0
        maxr=len(arr)-1
        n=len(arr[0])
        while(maxl<=maxr):
            maxmid=(maxl+maxr)//2
            if(arr[maxmid][0]<=target and target<=arr[maxmid][n-1]):
                break
            elif(arr[maxmid][0]>target):
                maxr=maxmid-1
            else:
                maxl=maxmid+1
        
        check=arr[maxmid]
        print(check)
        l=0
        r=len(arr[0])-1
        while(l<=r):
            mid=(l+r)//2
            if check[mid]==target:
                return True
            elif check[mid]<target:
                l=mid+1
            else:
                r=mid-1
        return False
            
