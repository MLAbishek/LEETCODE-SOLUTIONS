class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        for i in range(len(arr)):
            if k>=arr[i]:
                k+=1
            else:
                break
        return k
