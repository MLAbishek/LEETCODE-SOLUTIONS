class Solution {
    public int maxDifference(String s) {
        int flag[] = new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            flag[index]++;
        }
        int maxodd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(flag[i]!=0){
                if((flag[i]&1)==1){
                    maxodd=Math.max(maxodd,flag[i]);
                    
                }
                else{
                    mineven=Math.min(mineven,flag[i]);
                    
                }
            }

        }
        if(maxodd!=Integer.MIN_VALUE && mineven!=Integer.MAX_VALUE){
            return maxodd-mineven;
        }
        else{
            return 0;
        }
    }
}