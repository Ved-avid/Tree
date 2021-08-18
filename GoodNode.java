

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
 
class GoodNode {
    public int goodNodes(TreeNode root) {
        
        return countGoodNode(root, root.val);
    }


    public int countGoodNode(TreeNode node, int max){
        if(node == null){
            return 0;
        }

        max = (int)Math.max(node.val, max);
        if(node.val>=max){
            return 1+ countGoodNode(node.left, max) + countGoodNode(node.right, max);
        }else{
            return  countGoodNode(node.left, max) + countGoodNode(node.right, max); 
        }
    }
}