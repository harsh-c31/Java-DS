package trees;

import trees.binarytree.BinaryTreeHelper;
import trees.binarytree.Node;

public class preorder {


	    
	    public static void preorderi(Node root) {
	        if (root == null) {
	            return;
	        }
	        System.out.print(root.data + " ");  // Print the root node's data
	        preorderi(root.left);  // Traverse the left subtree
	        preorderi(root.right);  // Traverse the right subtree
	    }

	   
		public static void main(String[] args) {
	        
	        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
	        
	        Node root = BinaryTreeHelper.buildTree(nodes);

	        
	        System.out.print("Preorder Traversal: ");
	        preorderi(root);  // Start preorder traversal from the root
	    }
	}