package DSA_Easy;

import java.util.ArrayList;
import java.util.List;

import Binary_Search_Tree.TreeNode;

public class BT94_BinaryTreeInorderTraversal {

	public static void main(String[] args) {		
		
	}
	

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		saveToList(root, list);		
		return list;
	}
	public void saveToList(TreeNode root, List<Integer> list) {
		if(root != null) {
			saveToList(root.left, list);
			list.add(root.val);
			saveToList(root.right, list);
		}		
	}

}
