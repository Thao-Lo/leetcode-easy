package Binary_Search_Tree;


public class BinaryTree {
	private TreeNode root;

	private TreeNode insertRec(TreeNode root, int val) {
		if (root == null) {
			root = new TreeNode(val);
			return root;
		}
		if (val < root.val) {
			root.left = insertRec(root.left, val);
		} else if (val > root.val) {
			root.right = insertRec(root.right, val);
		}
		return root;
		
	}

	private void displayRec(TreeNode node) {
		if (node != null) {
			displayRec(node.left);
			System.out.println(" " + node.val);
			displayRec(node.right);
		}
	}

	public void insert(int val) {
		root = insertRec(root, val);
	}

	public void display() {
		displayRec(root);
	}

}

