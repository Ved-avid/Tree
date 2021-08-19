/*

https://www.hackerrank.com/challenges/tree-preorder-traversal/problem


Complete the PreOrder function in the editor below, which has 1 parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single 
line of space-separated values.

Input Format

                             1
                               \
                                2
                                 \
                                  5
                                 /  \
                                3     6

Our test code passes the root node of a binary tree to the preOrder function.

Constraints

 Nodes in the tree 

Output Format

Print the tree's preorder traversal as a single line of space-separated values.







*/

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

