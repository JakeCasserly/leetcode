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
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return validate(root, max, min);
    }

    public boolean validate(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }
        if ( (node.val >= max) || (node.val <= min) ) {
            return false;
        }
        else {
            return validate(node.left, node.val, min) && validate(node.right, max, node.val);
        }
    }
}
