class Solution {
    private static void dfs(int ind,boolean[] vis,List<List<Integer>> arr){
        vis[ind]=true;
        for(int v:arr.get(ind)){
            if(!vis[v]){
                dfs(v,vis,arr);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int N=rooms.size();
        boolean[] vis = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            
                int key=q.poll();
                
                for(int nextKey:rooms.get(key)){
                    if(!vis[nextKey])
                        q.add(nextKey);
                        vis[nextKey]=true;
                
            }
        }
        // dfs(0,vis,rooms);
        for(boolean open:vis){
            if(!open){
                return false;
            }
        }
        return true;
    }
}