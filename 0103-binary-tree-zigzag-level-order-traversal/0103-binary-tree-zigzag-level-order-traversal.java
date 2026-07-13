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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rev = false;
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp = new ArrayList<>();
            while(size-- >0){
                TreeNode ele = q.poll();
                temp.add(ele.val);
                if(ele.left !=null){
                    q.add(ele.left);
                }
                if(ele.right!=null){
                    q.add(ele.right);
                }

            }
            if(rev) Collections.reverse(temp);
            rev = !rev;
            ans.add(temp);

        }
        return ans;
    }
}