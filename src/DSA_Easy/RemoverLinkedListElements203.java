package DSA_Easy;

public class RemoverLinkedListElements203 {

	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(1)))));

//		while(list != null) {
//			System.out.println(list.val);
//			list = list.next;
//		}
		int val = 1;
		ListNode newList = removeElements(list, val);
		while(newList != null) {
			System.out.print(newList.val + " ");
			newList = newList.next;
		}
	}

	public static ListNode removeElements(ListNode list, int val) {
		
		while(list != null && list.val == val) {
			list = list.next;
		}		
		//init the new list
		ListNode init = new ListNode(0);  			
		ListNode newList = init;
				
		while (list != null) {
			if (list.val != val) {
				//point to new address with value is list.val
				newList.next = new ListNode(list.val);
				//move newList to the new address
				newList = newList.next;
			}
			list = list.next;
		}		
		//address of the head of new list
		return init.next;
	}
}
