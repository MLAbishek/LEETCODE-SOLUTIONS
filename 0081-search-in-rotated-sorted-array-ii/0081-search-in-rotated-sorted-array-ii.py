class Solution:
    def search(self, arr: List[int], target: int) -> int:
        l=0
        r=len(arr)-1

        while(l<=r):
            mid=(l+r)//2
            if arr[mid]==target:
                return True
            if arr[l]==arr[mid] and arr[mid]==arr[r]:
                l+=1
                r-=1
            elif arr[l]<=arr[mid]:
                if arr[l]<=target and target<arr[mid]:
                    r=mid-1
                else:
                    l=mid+1
            else:
                if arr[mid]<target and target <= arr[r]:
                    l=mid+1
                else:
                    r=mid-1
        return False




        