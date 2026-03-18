/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findlca(root,p,q);
    }
    private static TreeNode findlca(TreeNode root, TreeNode p,TreeNode q){
        if(root==null){
            return root;
        }
        if(p.val<root.val && q.val<root.val){
            return findlca(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return findlca(root.right,p,q);
        }
        return root;
    }
}