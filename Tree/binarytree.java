package trees;

public class binarytree {

	    static class Node {
	        int data;
	        Node left;
	        Node right;

	       
	        Node(int data) {
	            this.data = data;
	            this.left = null;
	            this.right = null;
	        }
	    }

	    static class BinaryTreeHelper {
	        static int idx = -1;

	       
	        public static Node buildTree(int[] nodes) {
	            idx++;
	            if (nodes[idx] == -1) {
	                return null; 
	            }
	            Node newNode = new Node(nodes[idx]);
	            newNode.left = buildTree(nodes); // Build left subtree
	            newNode.right = buildTree(nodes); // Build right subtree
	            return newNode;
	        }
	    }

	    public static void main(String[] args) {
	        
	        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
	        
	   
	        Node root = BinaryTreeHelper.buildTree(nodes);
	        
	        // Print the root node's data
	        System.out.println("Root node: " + root.data);
	    }
	}
