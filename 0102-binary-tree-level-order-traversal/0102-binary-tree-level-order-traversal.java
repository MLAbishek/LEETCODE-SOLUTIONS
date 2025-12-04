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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        ans.add(Arrays.asList(root.val));
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode value=q.poll();
                if(value.left!=null){
                    l.add(value.left.val);
                    q.add(value.left);
                }
                if(value.right!=null){
                    l.add(value.right.val);
                    q.add(value.right);
                }
                
            }
            if(l.size()!=0){
                ans.add(l);
            }
        }
        return ans;
    }
}