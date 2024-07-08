package DSA_Medium;

public class DeleteNodeLinkedList_237 {

	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(4, new ListNode(6)))));

	}

	public static void deleteNode(ListNode node) {
		// base on the request
		// just need to delete the value of the node, then node.next will point to
		// node.next.next
		// the node after node will be nothing to point to, and clean by gc

		ListNode current = node.next;
		node.val = current.val;
		node.next = current.next;
		current.next = null;
		System.gc();
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	};

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}