class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        // Base case: if the root is null, no path exists
        if (root == null) return false;

        // Update the target by subtracting the current node's value
        target -= root.val;

        // Check if we have reached a leaf node and the target is met
        if (target == 0 && root.left == null && root.right == null) return true;

        // Recursively check the left and right subtrees
        boolean left = hasPathSum(root.left, target);
        boolean right = hasPathSum(root.right, target);

        // Return true if either the left or right subtree has a valid path
        return (left || right);
    }
}