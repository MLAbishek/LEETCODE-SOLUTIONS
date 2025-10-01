class Solution {
    private static int find(int a,int b){
        if(b==0) return a;
        return find(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            max=Math.max(max,n);
            min=Math.min(min,n);
            
        }
        return find(max,min);
    }
}