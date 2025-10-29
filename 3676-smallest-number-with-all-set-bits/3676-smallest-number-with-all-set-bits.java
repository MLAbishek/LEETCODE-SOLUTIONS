class Solution {
    public int smallestNumber(int n) {
        int val=1;

        while(true){
            int num=(1<<val)-1;
            if(num>=n) return num;
            val++;
        }
    }
}