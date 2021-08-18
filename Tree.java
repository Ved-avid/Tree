/*

Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].In between the
path of the element low and High (low and high inclusive)

                         10
                       /   \
                      5     15
                     / \      \
                    3   7     18
                     
Here low = 7 and high = 15
Therefore Numbers in [7,15]  in path from root to 7 and root to 8 - [7, 10, 15]
So answer = 32

*/


/* -- Ved -- */










import java.util.*;


 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

public class Tree {
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
