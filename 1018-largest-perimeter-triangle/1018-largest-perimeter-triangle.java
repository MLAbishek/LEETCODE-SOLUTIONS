class Solution {
    private static void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
        for(int i=2;i<nums.length;i++){
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            if(a+b>c && b+c>a && a+c>b){
                return a+b+c;
            }
        }
        return 0;
    }
}