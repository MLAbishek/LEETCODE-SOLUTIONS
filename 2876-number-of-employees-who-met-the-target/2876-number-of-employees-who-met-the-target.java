class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int e:hours){
            if(e>=target)
                count++;
        }
        return count;
    }
}