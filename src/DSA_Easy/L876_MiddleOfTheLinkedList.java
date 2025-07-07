package DSA_Easy;

public class L876_MiddleOfTheLinkedList {

	// return middle node
	// if 2 middle node, return the 2nd one

	// 2 nodes: 1 step and 2 steps
	public ListNode middleNode(ListNode head) {

		ListNode mid = head;
		ListNode current = head;
		int step = 0;

		while (current != null) {
			current = current.next;
			step++;
			if (step == 2) {
				mid = mid.next;
				step = 0;
			}
		}

		return mid;
	}
}
