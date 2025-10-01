class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            p.add(n);
        }
        while(!p.isEmpty() && p.size()!=1){
            int f=p.poll();
            int s=p.poll();
            if(f!=s){
                p.add(f-s);
            }
        }
        if(p.isEmpty())
            return 0;
        return p.poll();
    }
}