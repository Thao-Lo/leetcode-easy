package DSA_Medium;

import java.util.ArrayList;
import java.util.List;

public class LL19_RemoveNthNodeFromEndOfList {
	// problem: remove a nth node count from the end of a linkedlist
	
	// Way 1: brute force solution Map/List - On On
	public ListNode removeNthFromEnd(ListNode head, int n) {
		List<ListNode> list = new ArrayList<>();
		ListNode current = head;

		while (current != null) {
			list.add(current);
			current = current.next; // index is the position
		}
		
		int remove = list.size() - n;
		//special case: list.size() = 1, n = 1
		// if head.next = null -> empty list
		if (remove == 0) {
			return head.next; 
		}
		
		//normal case
		ListNode prev = list.get(remove - 1);
		ListNode next = list.get(remove);
		prev.next = next.next;

		return head;
	}
}



