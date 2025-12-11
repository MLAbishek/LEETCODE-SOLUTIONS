class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int R=triangle.size();
        for(int r=R-2;r>=0;r--){
            int C=triangle.get(r).size();
            for(int c=C-1;c>=0;c--){
                int min=Math.min(triangle.get(r+1).get(c),triangle.get(r+1).get(c+1));
                int curval=triangle.get(r).get(c);
                triangle.get(r).set(c,min+curval);
            }
        }
        return triangle.get(0).get(0);
    }
}