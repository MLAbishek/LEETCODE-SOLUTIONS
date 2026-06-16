class Solution {

    private int result = 0;

    private int[] findMax(TreeNode root) {

        if (root == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = findMax(root.left);
        int[] right = findMax(root.right);
        if (left[1] >= root.val || right[0] <= root.val) {
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
        }

        int sum = root.val + left[2] + right[2];
        result = Math.max(result, sum);

        int minVal = Math.min(root.val, left[0]);
        int maxVal = Math.max(root.val, right[1]);

        return new int[]{minVal, maxVal, sum};
    }

    public int maxSumBST(TreeNode root) {
        result = 0;
        findMax(root);
        return result;
    }
}