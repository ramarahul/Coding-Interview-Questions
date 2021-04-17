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
    Integer prev = null;
    int abs_min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root.left!=null)
        minDiffInBST(root.left);
        if(prev!=null)
        abs_min = Math.min(root.val-prev,abs_min);
        prev = root.val;
        if(root.right!=null)
        minDiffInBST(root.right);
        return abs_min;
        
    }
}
