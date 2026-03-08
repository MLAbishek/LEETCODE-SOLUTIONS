class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        ans=[]
        intervals.sort()
        ans.append(intervals[0])
        for i in range(1,len(intervals)):
            if intervals[i][0]<=ans[-1][1]:
                ele=ans.pop()
                newele=[min(ele[0],intervals[i][0]),max(intervals[i][1],ele[1])]
                ans.append(newele)
            else:
                ans.append(intervals[i])
        return ans
        