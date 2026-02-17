class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean sign=true;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            sign=false;
        }
        int ans=0;
        long d=(Math.abs((long)dividend));
        long n=(Math.abs((long)divisor));
        while(d>=n){
            int count=0;
            while(d>=(n<<count+1)){
                count++;
            }
            ans+=(1<<count);
            d-=(n<<count);
        }
        if(!sign)
            return -ans;
        return ans;
    }
}