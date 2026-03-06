class Solution {
    private static long helper(long h,boolean even){
        long res=h;
        if(!even){
            h=h/10;
        }
        while(h>0){
            res=(res*10)+(h%10);
            h=h/10;

        }
        return res;

    }
    public String nearestPalindromic(String n) {
        int len=n.length();
        boolean even=false;
        if(len%2==0)
            even=true;
        ArrayList<Long> arr = new ArrayList<>();
        int mid=0;
        if(even){
            mid=len/2;
        }
        else{
            mid=(len+1)/2;
        }
        long half=Long.parseLong(n.substring(0,mid));
        arr.add(helper(half,even));
        arr.add(helper(half+1,even));
        arr.add(helper(half-1,even));
        long nine=(long)(Math.pow(10,len-1));
        nine--;
        arr.add(nine);
        long hun=(long)(Math.pow(10,len));
        hun++;
        arr.add(hun);

        long num=Long.MAX_VALUE;
        long dis=Long.MAX_VALUE;
        long full=Long.parseLong(n);
        for(long i:arr){
            if(i==full)
                continue;
            long tempdis=(long)(Math.abs(full-i));
            if(tempdis<dis){
                dis=tempdis;
                num=i;
            }
            else if(tempdis==dis){
                num=Math.min(num,i);
            }
            else{
                continue;
            }
        }
        System.out.println(arr.toString());
        return String.valueOf(num);
        

    }
}