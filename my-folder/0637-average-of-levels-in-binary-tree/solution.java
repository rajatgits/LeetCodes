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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if(root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            int level = queue.size();

            double average = 0;

            for(int i = 0; i < level; i++) {
                TreeNode curr = queue.poll();
                
                average += curr.val;
                
                if(curr.left != null) {
                    queue.offer(curr.left);
                }

                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            average = average / level;
            list.add(average);
        }
        return list;
    }
}
