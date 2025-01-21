package DSA_Medium;

import LinkedList.LinkedList;
import LinkedList.Node;

public class LL92_ReverseLinkedList_II {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
//		list.append(3);
//		list.append(4);
//		list.append(5);
//		list.append(6);
//		list.append(7);

		list.printList();
		list.head = reverseBetween(list.head, 1, 2);
		list.printList();

	}

	public static Node reverseBetween(Node head, int left, int right) {
		if(head == null || left == right) {
			return head;
		}
		
		// travel through the list to find node left - 1
		Node dummy = new Node (0);
		dummy.next = head;
		
		//start from dummy position to node before left
		Node beforeLeft = dummy;
		for(int i = 1; i < left; i++) {
			beforeLeft = beforeLeft.next;
		}
		
		// reverse the list to node right		
		Node prev = null;
		Node current = beforeLeft.next; //list start, Node at left position
		Node afterRight = null;
		
		// reverse list to Node at position right
		for( int i = left; i <= right; i++) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}			
		afterRight = current; // Node after right position right+1
		
		// connect node - 1 to right, connect left to right + 1 or right.next
		beforeLeft.next.next = afterRight; // Node at left position (beforeLeft.next).next
		beforeLeft.next = prev; //prev is Node at right position
		

		return dummy.next; //head
	}

}
