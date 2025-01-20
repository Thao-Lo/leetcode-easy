package LinkedList;

public class LinkedList {
	public Node head;

	public LinkedList() {
		this.head = null;
	}

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
//			current.next = current; // current.next always point back to current, create infinte loop
			current = current.next; // update current to the next node that current.next was pointing to
		}
		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node newHead = new Node(data);

		newHead.next = head;
		head = newHead;
	}

	public void deleteNode(int data) {
		if (head == null) {
			return;
		}
		if (head.value == data) {
			head = head.next; // if data is at the head node, move head to the next node
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.value == data) { // node after current
				current.next = current.next.next; // the address of deleted node will store in the current node.next
				return;
			}
			current = current.next;
		}

	}

	public Node findNode(int data) {
		Node current = head;

		while(current != null) {
			if(current.value == data) {				
				return current;
			}
			current = current.next;
		}
		return null;
	}
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;			
		}
		System.out.println("null");
	}
}
