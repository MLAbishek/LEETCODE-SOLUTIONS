class Solution {
    public int candy(int[] ratings) {
        int N=ratings.length;
        int arr[]=new int[N];
        Arrays.fill(arr,1);
        for(int i=1;i<N;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }

        for(int i=N-2;i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;

    }
}