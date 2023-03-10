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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> values = new ArrayList<>();
        
        Stack<TreeNode> nodesVisited = new Stack();
        
        while(root != null || !nodesVisited.isEmpty()) {
            while(root != null) {
                values.add(root.val);
                nodesVisited.push(root);
                root = root.left;
            }
            root = nodesVisited.pop();
            root = root.right;
        }
        
        return values;
    }
}