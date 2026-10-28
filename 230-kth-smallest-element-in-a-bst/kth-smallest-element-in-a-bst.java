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
    // public int kthSmallest(TreeNode root, int k) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     inOrder(root, ans);
    //     return ans.get(k-1);
    // }
    // public void inOrder(TreeNode root, ArrayList<Integer> ans){
    //     if(root==null) return;
    //     inOrder(root.left, ans);
    //     ans.add(root.val);
    //     inOrder(root.right, ans);
    // }

    //More efficient way using Array....
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = {1,-1};
        inOrder(root,arr,k);
        return arr[1];
    }
    public void inOrder(TreeNode root, int[] arr, int k){
        if(root==null) return;
        inOrder(root.left, arr,k);
        if(arr[0]==k) arr[1] = root.val;
        arr[0]++;
        inOrder(root.right, arr,k);
    }
}