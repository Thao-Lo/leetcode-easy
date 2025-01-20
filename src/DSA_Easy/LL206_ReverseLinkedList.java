package DSA_Easy;

import LinkedList.LinkedList;
import LinkedList.Node;

public class LL206_ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
			
		list.printList();
		System.out.println(list.head.value);
		
		list.head = reverseList(list.head);
		list.printList();
	}

	public static Node reverseList(Node head) {
		Node prev = null;	
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;			
		}		
		
		return prev;
	}
}

 