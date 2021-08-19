
/*

https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

Complete the PostOrder function in the editor below. It received 1 parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated values.

Input Format



                              1                     1
                               \
                                2
                                 \
                                  5
                                 /  \
                                3     6

Our test code passes the root node of a binary tree to the  function.

Constraints

 Nodes in the tree  

Output Format
           4 3 6 5 2 1 

Print the tree's postorder traversal as a single line of space-separated values.



*/



















import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        //left --> right -- > root
        if(root == null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

	public static Node insert(Node root, int data) {
