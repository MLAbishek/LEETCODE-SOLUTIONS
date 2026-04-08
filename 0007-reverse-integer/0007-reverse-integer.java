class Solution {
    public int reverse(int x) {
        boolean flag=true;
        if(x<0){
            flag=false;

        }
        long rem=0;
        x=Math.abs(x);
        while(x>0){
            rem=(rem*10)+(x%10);
            x=x/10;
        }
        if (rem>Integer.MAX_VALUE || rem<Integer.MIN_VALUE){
            return 0;
        }
        if(!flag){
            return -1*(int)rem;
        }
        return (int)rem;
    }
}