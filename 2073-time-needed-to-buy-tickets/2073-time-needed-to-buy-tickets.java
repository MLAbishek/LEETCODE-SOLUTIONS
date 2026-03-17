
class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<int[]> q = new LinkedList<>();
        int N=arr.length;
        for(int i=0;i<N ;i++){
            q.add(new int[] {arr[i],i});
        }
        int day=0;
        while(q.size()!=0){
            day++;
            int fir[]=q.poll();
            int tic=fir[0];
            int ind=fir[1];
            fir[0]--;
            if(fir[0]==0 && fir[1]==k){
                return day;
            }
            if(fir[0]!=0)
                q.add(fir);
        }
        return -1;

    }
}