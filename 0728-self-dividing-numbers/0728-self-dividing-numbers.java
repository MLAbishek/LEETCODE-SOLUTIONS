class Solution {
    private static boolean div(int n){
        int temp=n;
        while(temp>0){
            int dig=temp%10;
            if(dig==0){
                return false;
            }
            System.out.println(dig);
            
            if(n%dig!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left ;i<=right;i++){
            if(div(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}