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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = inOrder(root, new ArrayList<Integer>());
        return ans.get(k - 1);
    }

    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return list;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

        return list;
    }
}
