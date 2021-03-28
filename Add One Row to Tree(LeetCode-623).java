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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(--depth > 1){
            int size = q.size();
            while(size-->0){
                TreeNode node = q.poll();
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            TreeNode lst = node.left;
            TreeNode rst = node.right;
            node.left = new TreeNode(val);
            node.right = new TreeNode(val);
            node.left.left = lst;
            node.right.right = rst;
        }
        
        return root;
        
    }
}
