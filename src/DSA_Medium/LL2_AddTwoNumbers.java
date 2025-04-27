package DSA_Medium;

import java.util.LinkedList;
import java.util.List;

public class LL2_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//WAY 1 -> not applicable for big number 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 1 -> 2 : 21
		// 3 -> 4 : 43
		// 21 + 43 = 64 -> 4 - 6
		int numOne = reverseNumber(l1);
		int numTwo = reverseNumber(l2);
		int total = numOne + numTwo;

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		if (total == 0) {
			return new ListNode(0);
		}
		// reverse number to linkedList
		while (total > 0) {
			int digit = total % 10;
			current.next = new ListNode(digit);
			current = current.next;
			total = total / 10;
		}
		return dummy.next;
	}

	// function to return reverse number
	public static int reverseNumber(ListNode node) {
		int num = 0;
		int count = 0;
		// 1 - > 2: 1 + 2 x 10
		while (node != null) {
			num += node.val * (int) Math.pow(10, count);
			node = node.next;
			count++;
		}
		return num;
	}	

}
