class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int check=1;
        while(start>0 || goal>0){
            if((start&check) != (goal&check)){
                count++;
            }
            start=start>>1;
            goal=goal>>1;
        }
        return count;
    }
}