class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int check=1;
        while(x>0 || y>0){
            if((check&x) != (check&y)){
                count++;

            }
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
}