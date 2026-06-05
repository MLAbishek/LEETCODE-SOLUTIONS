class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(b[0],a[0]);

        });
        ArrayList<int[]> con = new ArrayList<>();
        for(int[] p:people){
            con.add(p[1],p);
        }
        int arr[][]=new int[people.length][2];
        for(int i=0;i<people.length;i++){
            arr[i]=con.get(i);
        }
        return arr;
    }
}