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
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.add(root);
        ans.add(new ArrayList<>(Arrays.asList(root.val)));
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            while(size>0){
                TreeNode r=q.poll();
                if(r.left!=null){
                    l.add(r.left.val);
                    q.add(r.left);
                }
                if(r.right!=null){
                    l.add(r.right.val);
                    q.add(r.right);
                }
                size--;
            }
            if(l.size()>0)
                ans.add(l);
            

        }
        return ans;
    }
}