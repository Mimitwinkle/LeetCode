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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> values = new ArrayList<>();
        
        if(root == null) return values;
        
        Stack<TreeNode> nodes = new Stack<>();
        
        TreeNode current = root;
        
        while(current != null || !nodes.isEmpty()) {
            while(current != null) {
                nodes.push(current);
                current = current.left;
            }
            current = nodes.pop();
            values.add(current.val);
            current = current.right;
        }
        
        return values;
    }
}