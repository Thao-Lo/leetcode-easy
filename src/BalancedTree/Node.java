package BalancedTree;

public class Node {
	int key;
	int height;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key = key;
		height = 1; // each new node will have height = 1
		left = right =null;
	}
	
	
	int height(Node node) {
		return (node == null) ? 0 : node.height;
	}
	
	//Balance factor
	int getBalanceFactor(Node node) {
		return (node == null) ? 0 : height(node.left) - height(node.right);
	}
	
	int getHeight(Node node) {
		if(node == null) return 0;
		return 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}
	
	//left left imbalance
	Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;
		
		//Rotate
		x.right = y;
		y.left = T2;
		
		//update height
		y.height = Math.max(height(y.left) , height(y.right) + 1);
		x.height = Math.max(height(x.left), height(x.right) + 1);
		
		return x;
	}
	
	
	
	
}
