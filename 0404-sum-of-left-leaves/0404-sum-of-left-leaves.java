/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static int dfs(TreeNode root,boolean left){
        if(root==null){
            return 0;
        }
        int a=dfs(root.left,true);
        if(root.left==null && root.right==null && left==true){
            return root.val;
        }
        int b=dfs(root.right,false);
        return a+b;
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,false);
    }
}