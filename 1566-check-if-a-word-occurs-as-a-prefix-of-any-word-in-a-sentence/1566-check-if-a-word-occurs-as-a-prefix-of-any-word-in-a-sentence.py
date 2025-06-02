class Solution:
    def isPrefixOfWord(self, sentence: str, searchword: str) -> int:
        sentence=sentence.split()
        for index,word in enumerate(sentence):
            letters=0
            if len(word)<len(searchword):
                continue
            else:

                for i in range(len(searchword)):
            
                    if searchword[i]==word[i]:

                        letters+=1
                    if letters==len(searchword):
                        return index+1
        return -1


        