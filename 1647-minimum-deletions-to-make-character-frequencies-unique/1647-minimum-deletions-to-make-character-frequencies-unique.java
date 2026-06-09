class Solution {
    public int minDeletions(String s) {
        int arr[]=new int[26];
        int N=s.length();
        for(int i=0;i<N;i++){
            arr[s.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=24;i>=0;i--){
            while(arr[i]>0 && arr[i]>=arr[i+1]){
                arr[i]--;
                count++;
            }
        }
        return count;
    }
}