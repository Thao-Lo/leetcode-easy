package Binary_Search_Tree;

public class T938_Range_Sum_Of_BST {

	public int rangeSumBST(TreeNode root, int low, int high) {
		//base case
		if(root == null) {
			return 0;
		}		
		int acc = 0;
		
		if (root.val >= low && root.val <= high) {
			acc += root.val;
		}
		//recursive part: get accumulated value
		
		//if root.val > low -> travel left (still have value >= low in left)
		if(root.val > low) {
			acc += rangeSumBST(root.left, low, high);
		}
		//if root.val < high -> travel right  => get sum accumulate of all values in range
		if(root.val < high) {
			acc += rangeSumBST(root.right, low, high);
		}
				
		return acc;

	}

	

}

// low and high -> find sum within the range
// tree travesal and get sum