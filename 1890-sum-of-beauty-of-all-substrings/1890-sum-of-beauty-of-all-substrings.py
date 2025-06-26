class Solution:
    def beautySum(self, s: str) -> int:
        ans=0
        for i in range(len(s)-1):
            hashmap={}
            hashmap[s[i]]=1
            for j in range(i+1,len(s)):
                if s[j] not in hashmap:
                    hashmap[s[j]]=1
                else:
                    hashmap[s[j]]+=1
                
                maxfreq=float('-inf')
                minfreq=float('inf')

                for key,value in hashmap.items():
                    maxfreq=max(maxfreq,value)
                    minfreq=min(minfreq,value)
                if(minfreq!=maxfreq and minfreq!=float('inf') and maxfreq!=float("-inf")):
                    ans+=(maxfreq-minfreq)
        return ans

                    
        