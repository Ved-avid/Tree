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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        Set<TreeNode> path = new HashSet<>();
        if(!getPath(root,low,path) || !getPath(root,high,path)){
            return -1;
        }
        
        List<TreeNode> list = new ArrayList<>(path);
        int sum=0;
        for(TreeNode node : list){
            if(node.val>=low && node.val<=high){
                sum += node.val;
            }
        }
        return sum;
        
    }
    
    public boolean getPath(TreeNode node, int key,Set<TreeNode> path){
         if(node == null){
             return false;
         }
        
         path.add(node);
        if(node.val == key){
            return true;
        }
        
        if(node.left != null && getPath(node.left, key, path)){
            return true;
        }
        
        if(node.right != null && getPath(node.right, key, path)){
            return true;
        }
        
        path.remove(path.size()-1);
        return false;
    }
}