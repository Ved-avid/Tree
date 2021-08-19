
import java.util.*;
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
class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return -1;
        }
        Set<TreeNode> set = new HashSet<>();
        addElement(root, low, high, set);
        List<TreeNode> list = new ArrayList<>(set);
        int sum=0;
        for(TreeNode node : list){
            if(node.val>=low && node.val<=high){
                sum += node.val;
            }
        }
        return sum;
        
    }
    
    public void addElement(TreeNode node, int low, int high, Set<TreeNode> ele){
         if(node == null){
             return ;
         }
         
        if(node.val >= low && node.val<=high){
            ele.add(node);
        }
        if(node.left != null){
             addElement(node.left, low, high, ele);
        }
        if(node.right != null){
             addElement(node.right, low, high, ele);
        }
         
    }
}