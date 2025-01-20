package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;

//Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
//Output: [4,2,6,5,7,1,3,9,8]
public class QueueForBinaryTree {
	// Method to build a binary tree from an array representation
	public TreeNode buildTree(Integer[] nodes) {
		if (nodes.length == 0)
			return null; // Handle empty array case

		// Create the root node from the first element
		TreeNode root = new TreeNode(nodes[0]);
		Queue<TreeNode> queue = new LinkedList<>(); // Queue for processing nodes
		queue.add(root); // Start with the root in the queue

		int i = 1; // Index for the array
		while (i < nodes.length) {
			// Get the current node from the queue, also remove it from queue
			TreeNode current = queue.poll();

			// Assign left child if the next element is not null
			if (nodes[i] != null) {
				current.left = new TreeNode(nodes[i]); // Create the left child
				queue.add(current.left); // Add it to the queue for further processing
			}
			i++; // Move to the next element
			if (i >= nodes.length)
				break; // Check if we've processed all elements

			// Assign right child if the next element is not null
			if (nodes[i] != null) {
				current.right = new TreeNode(nodes[i]); // Create the right child
				queue.add(current.right); // Add it to the queue
			}
			i++; // Move to the next element
		}

		return root; // Return the constructed tree's root
	}

	// Inorder traversal to verify the structure of the tree
	public void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left); // Visit left subtree
			System.out.print(root.val + " "); // Visit current node
			inorderTraversal(root.right); // Visit right subtree
		}
	}

//	    public static void main(String[] args) {
//	        BinaryTree bt = new BinaryTree();
//	        Integer[] nodes = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
//	        TreeNode root = bt.buildTree(nodes);
//
//	        System.out.print("Inorder Traversal: ");
//	        bt.inorderTraversal(root);  // Output: 4 2 6 5 7 9 1 3 8
//	    }
}
