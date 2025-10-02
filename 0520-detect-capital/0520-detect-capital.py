class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        if word.isupper():
            return True
        if word.istitle():
            return True
        if word.islower():
            return True
        return False