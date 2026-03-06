class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int max = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                max=Math.min(max,nums[mid]);
                l++;
                r--;

            } else {
                if (nums[l] <= nums[mid]) {
                    max = Math.min(max, nums[l]);
                    l = mid + 1;
                } else {
                    max = Math.min(max, nums[mid]);
                    r = mid - 1;
                }
            }
        }
        if(max==Integer.MAX_VALUE)
            return nums[0]; 
        return max;
    }
}