package DSA_Easy;


public class MergeTwoSortedLists21 {
	public static void main(String[] args) {

		ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
		// (1,next->3,next->4,null)

		ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(5)));
		// 2,next -> 4,next-> 5, null;

		ListNode mergedList = mergeTwoLists(list1, list2);
			
		//print the list
		ListNode current = mergedList;		
		while(current != null) {
			System.out.print(current.val + " ");
			current = current.next;
			
		}

	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode init = new ListNode(-1);
		ListNode current = init;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		return init.next;
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
