class Solution {
    public String largestGoodInteger(String num) {
        int l,r;
        l=0;
        r=0;
        int N=num.length();
        int maxnum=Integer.MIN_VALUE;
        while(r<N){
            l=r;
            while(r<N && num.charAt(l)==num.charAt(r))
                r++;
            if(r-l >= 3){
                int val=Character.getNumericValue(num.charAt(l));
                maxnum=Math.max(maxnum,val);
            }
        }
        if(maxnum==Integer.MIN_VALUE)
            return "";
        else{
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<3;i++){
                sb.append(String.valueOf(maxnum));
            }
            return sb.toString();
        }

    }
}