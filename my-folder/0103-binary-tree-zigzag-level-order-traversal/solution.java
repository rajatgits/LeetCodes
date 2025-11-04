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
        if(root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean hasOdd = false;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                if(currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if(currNode.right != null) {
                    queue.offer(currNode.right);
                }
                currentLevel.add(currNode.val);
            }
            if(hasOdd) {
                Collections.reverse(currentLevel);
            }
            ans.add(currentLevel);
            hasOdd = !hasOdd;
        }
        return ans;
    }
}
