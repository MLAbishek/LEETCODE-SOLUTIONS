class Solution {
    public int countPrimes(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,1);
        for(int i=2;i*i<=n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=0;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}