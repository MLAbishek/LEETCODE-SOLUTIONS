class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int N = k;
        helper(0, ans, curr, N, n, 0);
        return ans;
    }

    private static void helper(int index, List<List<Integer>> ans, List<Integer> curr, int N, int total, int val) {
        if (total == 0) {
            if (index == N) {
                ans.add(List.copyOf(curr));
                return;
            }

        }
        for (int i = val + 1; i <= 9; i++) {
            curr.add(i);
            helper(index + 1, ans, curr, N, total - i, i);
            curr.remove(curr.size() - 1);
        }

    }
}