/*

Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.


                                    3
                                  /   \
                                 1     4
                                /    /   \
                               3    1     5
                               
Input: root = [3,1,4,3,null,1,5]
Output: 4


Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.

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
