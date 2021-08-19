


/*

https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem



*/

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root == null){
              return -1;
          } 
        int rightHeight = height(root.right);
        int leftHeight = height(root.left);
        return ((int)Math.max(rightHeight,leftHeight)+1);
    }

