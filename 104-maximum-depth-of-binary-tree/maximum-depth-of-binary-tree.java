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
    public int maxDepth(TreeNode root) {
        int ans = 0;
        return depth(ans,root);
    }
    public int depth(int ans, TreeNode root){
        if(root==null) return ans;
        return ans = 1 + Math.max(depth(ans, root.left), depth(ans, root.right));
    }
}