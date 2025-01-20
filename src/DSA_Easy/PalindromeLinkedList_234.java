package DSA_Easy;

import java.util.Stack;

public class PalindromeLinkedList_234 {

	public static void main(String[] args) {

		ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

		boolean isPalindrome = isPalindrome1(list);
		boolean isPalindrome2 = isPalindrome2(list);
		System.out.println(isPalindrome);
		System.out.println(isPalindrome2);
	}

	// 14ms beast 17.58% 57.98MB beats 82.03%
	private static boolean isPalindrome1(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		Stack<Integer> stack = new Stack<>();

		while (current != null) {
			stack.push(current.val);
			current = current.next;
		}
		current = head;
		while (current != null) {
			if (current.val == stack.pop()) {
				current = current.next;
			} else {
				return false;
			}
		}
		return true;
	}

	//// 10ms beast 26.73% 57.85MB beats 82.81%
	private static boolean isPalindrome2(ListNode head) {
		if (head == null) {
			return false;
		}
		if(head.next == null) {
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		Stack<Integer> stack = new Stack<>();
		
		while(fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;			
			fast = fast.next.next;
		}
		if(fast!= null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			if(slow.val != stack.pop()) {
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}

	private static ListNode reverseLinkedList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;

		while (current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		};

		ListNode(int val) {
			this.val = val;
		};

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}
}
