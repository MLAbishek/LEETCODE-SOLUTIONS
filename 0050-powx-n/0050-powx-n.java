class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long e=n;
        if(e<0) e=e*-1;
        while(e>0){
            if(e%2==1){
                ans=ans*x;
                e=e-1;
            }
            else{
                x=x*x;
                e=e/2;
            }
        }
        if(n<0) return ((double)1/ans);
        return ans;
    }
}