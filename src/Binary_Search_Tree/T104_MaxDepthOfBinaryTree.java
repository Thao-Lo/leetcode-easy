package Binary_Search_Tree;

public class T104_MaxDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		return Math.max(leftDepth, rightDepth) + 1;		

	}

//	public static int checkDepth(TreeNode node, int count) {
//		if (node == null) {
//			return count;
//		}
//		if (node.left != null || node.right != null) {
//			count += 1;
//		}
//		return count;
//	}

}
