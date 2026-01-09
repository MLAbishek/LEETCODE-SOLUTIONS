class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            int n=s.length();
            int d1=Character.getNumericValue(s.charAt(n-4));
            int d2=Character.getNumericValue(s.charAt(n-3));
            int age=(d1*10)+d2;
            if(age>60){
                count++;
            }
        }
        return count;
    }
}