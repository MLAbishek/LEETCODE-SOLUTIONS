class Solution {
    private static boolean dfs(int node,boolean[] visited ,ArrayList<ArrayList<Integer>> arr,boolean[] pathvis){
        if(visited[node] && pathvis[node]){
            return true;
        }
        visited[node]=true;
        pathvis[node]=true;
        for(int next:arr.get(node)){
            if(!visited[next]){
                if(dfs(next,visited,arr,pathvis)){
                    return true;
                }
            }
            else if(pathvis[next]){
                return true;
            }
        }
        pathvis[node]=false;
        return false;
    }
    public boolean canFinish(int numcourses, int[][] prerequisites) {
        //Topological Sorting
        boolean visited[]=new boolean[numcourses];
        boolean pathvis[] = new boolean[numcourses];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<numcourses;i++){
            arr.add(new ArrayList<>());
        }

        for(int[] conn:prerequisites){
            arr.get(conn[0]).add(conn[1]);
        }

        for(int i=0;i<numcourses;i++){
            if(!visited[i]){
                if(dfs(i,visited,arr,pathvis))
                    return false;
            }
        }
        return true;
    }
}