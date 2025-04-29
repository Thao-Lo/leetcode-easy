package Binary_Search_Tree;

public class T108_ConverSortedArrayToBinarySearchTree {

	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST(int[] nums) {

		return buildTree(nums, 0, nums.length - 1);
	}

	public TreeNode buildTree(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = low + (high - low) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = buildTree(nums, low, mid - 1);
		node.right = buildTree(nums, mid + 1, high);
		return node;
	}
}
