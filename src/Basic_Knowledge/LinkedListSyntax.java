package Basic_Knowledge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListSyntax {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2, 4, 6));

		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 5));

		// Loop the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + ": " + list1.get(i));
		}

		// for each
		for (Integer num : list1) {
			System.out.println("num" + num);
		}

		ListIterator<Integer> loop = list1.listIterator();
		// loop forward
		while (loop.hasNext()) {
			Integer num = loop.next();
			System.out.println("next" + num);
		}
		// loop backward
		while (loop.hasPrevious()) {
			Integer num = loop.previous();
			System.out.println("previous" + num);
		}

		ListNode list3 = new ListNode();
		ListNode current = list3;
		for (int i = 1; i < 6; i++) {
			current.next = new ListNode(i);
			System.out.println("current.next: " + current.next);
			System.out.println("current.next value: " + current.next.val);
			current = current.next;
			System.out.println("current: " + current);
			System.out.println("current value: " + current.val);
			System.out.println("-----------");
		}

	}

}

class ListNode {
	int val;
	ListNode next;

	// default constructor
	ListNode() {
	};

	// contructor with value + next is null
	ListNode(int val) {
		this.val = val;
	}

	// constructor with node value and reference to next node
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}
