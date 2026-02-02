class Solution {
    public int majorityElement(int[] nums) {
        int val = -1;
        int count = 0;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            if (count == 0) {
                val = nums[i];
                count = 1;
            } else {
                if (val == nums[i]) {
                    count++;
                }
                if (val != nums[i]) {
                    count--;
                }
            }

        }
        return val;
    }
}