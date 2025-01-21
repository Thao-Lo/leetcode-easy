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
		Node current = head;
		int count = 1;
		Node beforeLeft = null;
		Node start = null;
		while (current.next != null) {
			if (count == left - 1) {
				beforeLeft = current;
				start = current.next;
				break;
			}
			current = current.next;
			count += 1;
		}
		// reverse the list to node right
		Node dummy = start;
		Node prev = null;
		Node afterRight = null;
		Node listStart = null;
		Node listEnd = null;
		while (dummy != null) {
			Node next = dummy.next;
			count += 1;
			if (count == right) {
				afterRight = dummy.next; // breakpoint right to right+1 can be null
				dummy.next = prev;
				listEnd = dummy;
				break;
			}
			dummy.next = prev;
			if (prev == null) {
				listStart = dummy;
			}
			prev = dummy;
			dummy = next;
		}
		// connect node - 1 to right, connect left to right + 1 or right.next
		beforeLeft.next = listEnd;
		listStart.next = afterRight;

		return head;
	}

}
