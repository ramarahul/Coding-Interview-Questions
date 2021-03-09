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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> rightSideView = new ArrayList<Integer>();
        if(root==null) return rightSideView;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                if(i==size-1){
                    rightSideView.add(current.val);
                }
                
                if(current.left!=null){
                    queue.add(current.left);
                }
                
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
        }
        
        return rightSideView;
        
    }
}
