package Binary_Search_Tree;

public class B226_Invert_Binary_Tree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		// recursive invert sub tree
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		// Swap
		root.left = right;
		root.right = left;

		return root;
	}

	public TreeNode invertTree1(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode T2 = root.left;
		root.left = root.right;
		root.right = T2;

		root.left = invertTree(root.left);
		root.right = invertTree(root.right);

		return root;
	}
}
