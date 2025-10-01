class Solution {
    public int heightChecker(int[] heights) {
        
        int n=heights.length;
        int correct[]=new int[n];
        for(int i=0;i<n;i++){
            correct[i]=heights[i];
        }
        Arrays.sort(correct);
        int count=0;
        for(int i=0;i<n;i++){
            if(correct[i]!=heights[i])
                count++;
        }
        return count;

    }
}