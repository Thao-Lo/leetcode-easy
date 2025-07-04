package BalancedTree;

public class Node {
	int key;
	int height;
	Node left;
	Node right;

	public Node(int key) {
		this.key = key;
		height = 1; // each new node will have height = 1
		left = right = null;
	}

	int height(Node node) {
		return (node == null) ? 0 : node.height;
	}

	// Balance factor
	int getBalanceFactor(Node node) {
		return (node == null) ? 0 : height(node.left) - height(node.right);
	}

	int getHeight(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}

	// left left imbalance
	Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		// Rotate
		x.right = y;
		y.left = T2;

		// update height
		y.height = 1 + Math.max(height(y.left), height(y.right));
		x.height = 1 + Math.max(height(x.left), height(x.right));

		return x;
	}

	Node leftRotate(Node y) {
		// A point node
		Node x = y.right;
		Node T2 = x.left;

		// rotate
		x.left = y;
		y.right = T2; // null

		// update height
		y.height = 1 + Math.max(height(y.left), height(y.right));
		x.height = 1 + Math.max(height(x.left), height(x.right));

		return x;

	}

	// 30 (2) - 10 (-1) - 20
	Node leftRightRotate(Node y) {
		// left rotate
		// appoint
		Node x = y.left;
		Node z = x.right;

		// rotate left on x
		x.right = z.left; // null
		z.left = x;
		
		// rotate right at y
		y.left = z.right; //null
		z.right = y;
		

		x.height = 1 + Math.max(height(x.left), height(x.right));
		y.height = 1 + Math.max(height(y.left), height(y.right));
		z.height = 1 + Math.max(height(z.left), height(z.right));

		return z;

	}
	
	Node rightLeftRotate(Node y) {
		// appoint node
		Node x = y.right;
		Node z = x.left;
		
		//Rotate right at x	
		x.left = z.right;
		z.right = x;
		
		//Rotate right at y		
		y.right = z.left;
		z.left = y;
		
		x.height = 1 + Math.max(height(x.left), height(x.right));
		y.height = 1 + Math.max(height(y.left), height(y.right));
		z.height = 1 + Math.max(height(z.left), height(z.right));
		
		return z;		

	}

}
