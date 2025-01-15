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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    private int maxPath(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = maxPath(node.left);
        int right = maxPath(node.right);

        left = Math.max(left, 0);
        right = Math.max(right, 0);

        int max = left + right + node.val;
        maxSum = Math.max(maxSum, max);

        return Math.max(left, right) + node.val;
    }
}
