class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean flag;
        if((n&1)==1){
            flag=true;
        }
        else{
            flag=false;
        }
        n=n>>1;
        while(n>0){
            int val=n&1;
            if((val==1 && flag==false) || (val==0 && flag==true)){
                flag=!flag;
                n=n>>1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}