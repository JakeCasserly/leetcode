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
    private boolean[] balanced = new boolean[1];
    public boolean isBalanced(TreeNode root) {
        balanced[0] = true;
        height(root);
        return balanced[0];
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight-rightHeight) > 1) {
            balanced[0] = false;
            return 0;
        }
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
