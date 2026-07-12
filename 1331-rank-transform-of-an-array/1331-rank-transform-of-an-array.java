class Solution {

    public int[] arrayRankTransform(int[] arr) {
        int N = arr.length;
        int[] sarr = arr.clone();
        Arrays.sort(sarr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ind = 1;
        for(int i=0;i<N;i++){
            if(!map.containsKey(sarr[i])){
                map.put(sarr[i],ind);
                System.out.println(sarr[i]+" "+ind);
                ind++;
                
            }
            
        }
        for(int i=0;i<N;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}