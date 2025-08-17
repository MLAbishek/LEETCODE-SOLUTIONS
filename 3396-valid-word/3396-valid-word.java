class Solution {
    private static boolean alphanum(char c){
        if(Character.isAlphabetic(c)){
            return true;
        }
        else if(c>='0' && c<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isValid(String word) {
        boolean vowel=false;
        boolean consonant=false;
        for(char c:word.toCharArray()){
            if(alphanum(c)){
                if(Character.isAlphabetic(c)){
                    char clow=Character.toLowerCase(c);
                    if(clow=='a' || clow=='e' || clow=='i' || clow=='o' || clow=='u'){
                        vowel=true;
                    }
                    else{
                        consonant=true;
                    }
                }
                
            }
            else{
                return false;
            }    
        }
        if(vowel && consonant && word.length()>=3 ){
            return true;
        }
        else{
            return false;
        }
    }
}