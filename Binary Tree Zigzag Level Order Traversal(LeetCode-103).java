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
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        
        Stack<TreeNode> oddLevel = new Stack<>();
        Stack<TreeNode> evenLevel = new Stack<>();
        
        oddLevel.push(root);
        
        while(!oddLevel.isEmpty() || !evenLevel.isEmpty()){
            int oddSize = oddLevel.size();
            ArrayList<Integer> oddList = new ArrayList<>();
            while(oddSize-->0){
                TreeNode node = oddLevel.pop();
                oddList.add(node.val);
                if(node.left!=null){
                    evenLevel.push(node.left);
                }
                if(node.right!=null){
                    evenLevel.push(node.right);
                }
            }
            
            if(oddList.size()>0)
            result.add(oddList);
            
            int evenSize = evenLevel.size();
            ArrayList<Integer> evenList = new ArrayList<>();
            while(evenSize-->0){
                TreeNode node = evenLevel.pop();
                evenList.add(node.val);
                if(node.right!=null){
                    oddLevel.push(node.right);
                }
                if(node.left!=null){
                    oddLevel.push(node.left);
                }
            }
            
            if(evenList.size()>0)
            result.add(evenList);
        }
        
        return result;
        
    }
}
