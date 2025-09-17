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
    public static boolean isTrue = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        //tryBranch(root, totalSum, targetSum);
        //System.out.println(isTrue);
        return leftSum || rightSum;
    }

    // public static void tryBranch(TreeNode root, int currentSum, int targetSum) {
    //     if (root.left != null) {
    //         currentSum += root.left.val;
    //         System.out.println(root.left.val);
    //         System.out.println("*l*"+currentSum);
    //         if (currentSum == targetSum) {
    //             isTrue = true;
    //             System.out.println("true");
    //         }
    //         else {
    //             tryBranch(root.left, currentSum, targetSum);
    //             currentSum -= root.left.val;
    //         }
    //     }
    //     if (root.right != null) {
    //         currentSum += root.right.val;
    //         System.out.println(root.right.val);
    //         System.out.println("*r*"+currentSum);
    //         if (currentSum == targetSum) {
    //             isTrue = true;
    //             System.out.println("true");
    //         }
    //         else {
    //             tryBranch(root.right, currentSum, targetSum);
    //             currentSum -= root.right.val;
    //         }
    //     }
    // }
}
