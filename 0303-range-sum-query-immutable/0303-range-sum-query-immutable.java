class NumArray {
    ArrayList<Integer> arr;
    public NumArray(int[] nums) {
        this.arr=new ArrayList<>();
        for(int n:nums){
            arr.add(n);
        }
    }
    
    public int sumRange(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            ans+=arr.get(i);
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */