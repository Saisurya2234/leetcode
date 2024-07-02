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
     public int deepestLeavesSum(TreeNode root) {
        
        if(root == null)
            return 0;
        
        int prev = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(q.isEmpty() == false){
            int cnt = q.size();
            prev = 0;
            for(int i=0;i<cnt;i++){
                TreeNode curr = q.poll();
                prev += curr.val;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }

        return prev;
        
    }
}