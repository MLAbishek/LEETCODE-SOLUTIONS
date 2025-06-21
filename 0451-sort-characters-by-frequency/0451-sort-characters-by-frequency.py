from collections import Counter
class Solution:
    def frequencySort(self, s: str) -> str:
        cnt = Counter(s)
        sort_map=sorted(cnt.items(),key=lambda x : x[1] ,reverse=True)
        print(sort_map)
        return "".join(char*count for char,count in sort_map)