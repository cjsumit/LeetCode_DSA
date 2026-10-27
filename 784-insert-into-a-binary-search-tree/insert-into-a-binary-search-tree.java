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
    //Using Void Return TYpe.........


    // public TreeNode insertIntoBST(TreeNode root, int val) {
    //     if(root == null) {
    //         return new TreeNode(val);
    //     }
    //     InsertNode(root, val);
    //     return root;
    // }
    // public void InsertNode(TreeNode root, int key){  
    //     if(key > root.val){
    //         if(root.right == null){
    //             root.right = new TreeNode(key);
    //         }else InsertNode(root.right, key);
    //     }else{
    //         if(root.left == null){
    //             root.left = new TreeNode(key);
    //         }else InsertNode(root.left, key);
    //     }
    // }

    //Using Node Return Type........

    public TreeNode insertIntoBST(TreeNode root, int val) {
        return InsertNode(root, val);
        // return root;
    }
    public TreeNode InsertNode(TreeNode root, int key){ 
        if(root == null) return new TreeNode(key); 
        if(key > root.val) root.right = InsertNode(root.right, key);
        else root.left = InsertNode(root.left, key);
        return root;
    }
}