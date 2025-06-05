class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        count=0
        index=0
        for i in range(len(mat)):
            tempcount=sum(mat[i])
            if tempcount>count:
                count=tempcount
                index=i
        
        return [index,count]
        