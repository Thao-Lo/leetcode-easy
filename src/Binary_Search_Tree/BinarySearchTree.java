package Binary_Search_Tree;

// Left subtree contains values smaller than root
// right subtree > root.val
// no dublicate
public class BinarySearchTree {
	// Binary Search Tree - correct order - use recursive 3, 3.left=1, 3.right=5
	public TreeNode insertNodeBST(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val); // base case: to insert new node
		if (val < root.val) {
			root.left = insertNodeBST(root.left, val);
		} else {
			root.right = insertNodeBST(root.right, val);
		}
		return root;
	}

	// search - recursive way
	public boolean searchBST(TreeNode root, int val) {
		if (root == null)
			return false;
		if (root.val == val)
			return true; // base case

		if (val < root.val) {
			searchBST(root.left, val);
		} else {
			searchBST(root.right, val);
		}
		return false;
	}

	// find Min
	public static int findMinBST(TreeNode root) {
		if (root == null)
			throw new IllegalArgumentException("Tree not exist");
		while(root.left != null) {
			root = root.left;
		}
		return root.val;
	}
	
	// delete a node
	public TreeNode deleteNodeBST(TreeNode root, int val) {
		if(root == null) {
			return null;
		}
		if(val < root.val) {
			root.left = deleteNodeBST(root.left, val); //recursive leftside until find the Node
		}else if(val > root.val) {
			root.right = deleteNodeBST(root.right, val);// recursive rightside until find the Node
		}else if(val == root.val) { // find node that need to be deleted
			//node with 1 or no child 
			if(root.left == null) {
				return root.right; // child of deleted node, can be null: root.left = root.left.right
			}
			if(root.right == null) {
				return root.left; //child of deleted node, can be null: root.left = root.left.left
			}
			
			//node with 2 childs (root.left and root.right != null)			
			root.val = findMinBST(root.right); //replace the node with min on rightside
			root.right = deleteNodeBST(root.right, root.val); //delete the node that replaced the root.val
		}
		return root;
	}
	
}
