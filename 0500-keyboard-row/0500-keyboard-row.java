class Solution {
    public String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        String r1="qwertyuiop";
        int row1[]=new int[26];
        for(char c:r1.toCharArray()){
            row1[Character.toLowerCase(c)-'a']++;
        }
        String r2="asdfghjkl";
        int row2[]=new int[26];
        for(char c:r2.toCharArray()){
            row2[Character.toLowerCase(c)-'a']++;
        }
        String r3="zxcvbnm";
        int row3[]=new int[26];
        for(char c:r3.toCharArray()){
            row3[Character.toLowerCase(c)-'a']++;
        }
        
        for(String s:words){
            boolean row1f=false;
            boolean row2f=false;
            boolean row3f=false;
            for(char c:s.toCharArray()){
                char cl=Character.toLowerCase(c);
                if(row1[cl-'a']==1){
                    row1f=true;
                }
                else if(row2[cl-'a']==1){
                    row2f=true;
                }
                else{
                    row3f=true;
                }

                
            }
            if((row1f && !row2f && !row3f ) || (!row1f && row2f && !row3f ) || (!row1f && !row2f && row3f )){
                ans.add(s);
            }

        }
        return ans.toArray(new String[0]);
    }
}