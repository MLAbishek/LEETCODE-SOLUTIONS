class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i=0;i<n;i++){
            mat.add(new ArrayList<>());
        }
        for(int[] pair:edges){
            int e1=pair[0];
            int e2=pair[1];
            mat.get(e1).add(e2);
            mat.get(e2).add(e1);

        }
        return dfs(source,visited,mat,n,destination);
        
    }
    private static boolean dfs(int edge,boolean[] visited,ArrayList<ArrayList<Integer>> mat, int n, int findest){
        visited[edge]=true;
        if(edge==findest){
            return true;
        }
        
        for(int dest:mat.get(edge)){
            if(!visited[dest]){
                if(dfs(dest,visited,mat,n,findest)){
                    return true;
                }
            }
        }
        
        return false;

    }
}