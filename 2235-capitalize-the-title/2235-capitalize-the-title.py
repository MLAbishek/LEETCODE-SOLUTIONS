class Solution:
    def capitalizeTitle(self, title: str) -> str:
        sen=title.split()
        for i in range(len(sen)):
            if len(sen[i])<3:
                sen[i]=sen[i].lower()
            else:

                sen[i]=sen[i].title()
        return " ".join(sen)
        