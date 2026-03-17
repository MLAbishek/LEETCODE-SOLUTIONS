class RecentCounter {
    Queue<Integer> q;
    int count;
    public RecentCounter() {
        this.q=new LinkedList<>();
        this.count=0;

    }
    
    public int ping(int t) {
        //some logic
        this.q.add(t);
        int lim=t-3000;
        while(!q.isEmpty() && lim>q.peek()){
            q.poll();
        }
        return q.size();



    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */