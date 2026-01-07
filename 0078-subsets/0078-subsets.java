class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans, 0, nums.length, nums, temp);
        return ans;

    }

    private static void helper(List<List<Integer>> ans, int i, int N, int[] nums, List<Integer> temp) {
        if (i == N) {
            ans.add(List.copyOf(temp));
            return;
        }

        temp.add(nums[i]);
        helper(ans, i + 1, N, nums, temp);
        temp.remove(temp.size() - 1);
        helper(ans, i + 1, N, nums, temp);

    }
}